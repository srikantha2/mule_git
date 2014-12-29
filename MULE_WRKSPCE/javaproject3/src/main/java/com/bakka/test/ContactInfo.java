/**
 * 
 */
package com.bakka.test;

/**
 * @author prakash
 *
 */
public class ContactInfo {
	private String firstName;
	private String lastName;
	private String emailId;
	private String phone;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactInfo [firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", phone=" + phone + "]";
	}
	

}
