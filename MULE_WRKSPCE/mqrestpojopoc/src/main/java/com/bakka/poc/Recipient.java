/**
 * 
 */
package com.bakka.poc;

/**
 * @author bakka
 *
 */
public class Recipient {
	
	private String email;

	@Override
	public String toString() {
		return "Recipient [email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
