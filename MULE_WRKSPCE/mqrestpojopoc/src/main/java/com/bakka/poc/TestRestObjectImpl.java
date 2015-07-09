package com.bakka.poc;

import java.util.LinkedList;
import java.util.List;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.bakka.poc.Customer;

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
