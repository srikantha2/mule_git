package com.sbakka.Impl;

import java.util.LinkedList;
import java.util.List;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.sbakka.objects.Customer;

public class TestRestObjectImpl /*implements Callable*/  {
	
	public List<Customer> processContactInfo(List<Customer> list){

		System.out.println("All Employees Contact Info from File::");
				for(Customer c:list){
					System.out.println(c);
				}
				List<Customer> payload = list;///new LinkedList<Customer>();
				return payload;
			}
	
	/*@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
	    MuleMessage msg = eventContext.getMessage();
	    //String method = msg.getProperty("http.method", PropertyScope.INBOUND);        
	    msg.setProperty("foo", "bar", PropertyScope.INVOCATION);
	    return null;
	}*/
}
