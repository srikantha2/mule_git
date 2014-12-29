package com.bakka.test;

import java.util.List;

public class EmployeesInfo {

	public void processContactInfo(List<ContactInfo> list){
System.out.println("All Employees Contact Info from File::");
		for(ContactInfo c:list){
			System.out.println(c);
		}
		
	}
}
