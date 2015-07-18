/**
 * 
 */
package com.bakka.poc;

import java.util.List;

/**
 * @author bakka
 *
 */
public class MailTemp1Processing {
	
	public List<MailTemp1RespForm> processContactInfo(List<MailTemp1RespForm> list){

		System.out.println("All Employees Contact Info from File::");
				for(MailTemp1RespForm c:list){
					System.out.println(c);
				}
				List<MailTemp1RespForm> payload = list;
				return payload;
			}
	
	

}
