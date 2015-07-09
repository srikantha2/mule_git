package com.sbakka.Impl;

import java.util.LinkedList;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.sbakka.objects.Customer;

public class SamplePostImpl /*implements Callable */{
	
	public LinkedList<Customer>  testCreateEmployee(String s) {
		Customer cust = new Customer();
		cust.setId(1);cust.setName("Sam Hooster");

		LinkedList< Customer> payload= new LinkedList<Customer>();
		payload.add(0, cust);
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
