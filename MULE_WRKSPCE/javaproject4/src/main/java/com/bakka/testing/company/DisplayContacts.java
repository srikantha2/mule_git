package com.bakka.testing.company;

import java.util.List;

public class DisplayContacts {
public void processEmployeeDetails(List<EContactInfo> list){
	System.out.println("------------------------------------------------------");
	System.out.println("Companies Employee Info::");
	for(EContactInfo ec:list)
		System.out.println(ec);
		
	System.out.println("------------------------------------------------------");	
}
}
