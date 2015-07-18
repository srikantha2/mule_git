package com.bakka.poc;

import java.util.List;

public class TestRestObjectImpl   {
	
	public List<Customer> processContactInfo(List<Customer> list){

		System.out.println("All Employees Contact Info from File::");
				for(Customer c:list){
					System.out.println(c);
				}
				List<Customer> payload = list;
				return payload;
			}
	
	
}
