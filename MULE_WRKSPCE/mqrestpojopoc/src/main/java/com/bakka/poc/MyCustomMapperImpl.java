/**
 * 
 */
package com.bakka.poc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections.map.HashedMap;

import com.bakka.poc.Customer;

/**
 * @author bakka
 *
 */
public class MyCustomMapperImpl {
	
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:localhost:1521:XYZ";
	private static final String DB_USER = "scott";
	private static final String DB_PASSWORD = "tiger";
	public MailReqForm processMappers(Object obj ){
		MailReqForm payload = (MailReqForm)obj;
		System.out.println("Body of Message::"+payload.getBody());
		payload.setMacros(getMacrosFromDB(extractMacrosList(payload.getBody())));
		return payload;
	}
	
	public static void main(String[]args){
		MyCustomMapperImpl cImpl= new MyCustomMapperImpl();
		MailReqForm cs=new MailReqForm();
		cs.setBody("[[image1]][[company]]::This Email is part of initial test of the REST API , [[url]] [[image2]]");
		cImpl.processMappers(cs);
		System.out.println(cs);
	}
	
	  public static List extractMacrosList(String  inputStr){
	    	 Integer nGrams = 2;
	         List<String> wordList = new ArrayList<String>();
	         String patternTpl = "\\[\\[\\b[\\w']+\\b\\]\\]";
	         for (int i = 0; i < nGrams; i++) {
	             // Create pattern.
	             StringBuilder stringPattern = new StringBuilder(patternTpl);
	             for (int j = 0; j < i; j++) {
	            	 stringPattern.append(" " + patternTpl);
	             }
	             Pattern word = Pattern.compile("(" +
	             		"?=(" + stringPattern + "))");
	             Matcher m = word.matcher(inputStr);

	             while (m.find()) {
	            	 String s=m.group(1).replaceAll("\\[\\[", "").replaceAll("\\]\\]", "");
	            	 if(!s.contains(" ")&& !wordList.contains(s))
	            		 wordList.add(m.group(1).replaceAll("\\[\\[", "").replaceAll("\\]\\]", ""));
	             
	             }
	    }
			return wordList;
	         }
	
	public Map getMacrosFromDB(List<String> list){
		Map retVal= new HashedMap();
		Connection con= getDBCOnnection();
		PreparedStatement ps = null;
        ResultSet rs = null;

		if(con!=null && list!=null && ! list.isEmpty()){
		try{  
			String query = createQuery(list.size());
             System.out.println("Query="+query);
		     ps = con.prepareStatement(query);
              int i=1;
	            for(String s: list){
	                ps.setString(i, s);
	                i++;
	            }
	            rs = ps.executeQuery();
	            
		      while(rs.next()){
		         //Retrieve by column name
		         retVal.put(rs.getString("mname"),rs.getString("mvalue"));
		         		      }
		      rs.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(ps!=null)
		            con.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(con!=null)
		            con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
			
		}
		
		return retVal;
		
	}


	
	private String createQuery(int length) {
        String query = "select mname, mvalue from temp.macros where mname in (";
        StringBuilder queryBuilder = new StringBuilder(query);
        for( int i = 0; i< length; i++){
            queryBuilder.append(" ?");
            if(i != length -1) queryBuilder.append(",");
        }
        queryBuilder.append(")");
        return queryBuilder.toString();
    }
	
	public Connection getDBCOnnection(){Connection dbConnection = null;
	 
	try {

		Class.forName(DB_DRIVER);

	} catch (ClassNotFoundException e) {

		System.out.println(e.getMessage());

	}

	try {

		dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
				DB_PASSWORD);
		return dbConnection;

	} catch (SQLException e) {

		System.out.println(e.getMessage());

	}

	return dbConnection;
}
}
