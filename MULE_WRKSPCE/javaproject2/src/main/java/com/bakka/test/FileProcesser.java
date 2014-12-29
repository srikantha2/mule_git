package com.bakka.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class FileProcesser {
	public void processFile(List<Map<String, String>> maps) {
  //      System.out.println(maps);
   //     System.out.println("Size: " + maps.size());
System.out.println("\nEmployee Contact Info1:");
int i=1;
        for(Map<String,String> mp: maps){
        	System.out.println("\nContact-"+i+":");
        	Set s1= mp.keySet();
            Iterator it = s1.iterator();
            while(it.hasNext()) {
            	String key= (String) it.next();
            	System.out.println(key+":"+mp.get(key));
            	
            }
            i++;
        }
           
    }
	
}
