package com.bakka.testing.rest.object;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	
	String id;
	String name;
	String address;
	/**
	 * @return the id
	 */
	@XmlElement
	public String getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	@XmlElement
	public String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	@XmlElement
	public String getAddress() {
		return address;
	}
	
	public Customer() {
		this("001", "Middleware School", "London, United Kingdom");
	}
	
	public Customer(String id, String name, String address){
		this.id= id;
		this.name= name;
		this.address= address;
	}
	

}
