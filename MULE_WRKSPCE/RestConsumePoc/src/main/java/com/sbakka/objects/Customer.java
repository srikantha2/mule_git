/**
 * 
 */
package com.sbakka.objects;

/**
 * @author sbakka
 *
 */
import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonAutoDetect;


public class Customer implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5493345618364509054L;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
}

