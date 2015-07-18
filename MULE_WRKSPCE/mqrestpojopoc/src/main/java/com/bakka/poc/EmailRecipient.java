/**
 * 
 */
package com.bakka.poc;

import java.io.Serializable;

/**
 * @author bakka
 *
 */
public class EmailRecipient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3618315457907041109L;


	private String emailAddress;
	private String status;
	private int recpId;
	private int emailTxId;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getRecpId() {
		return recpId;
	}
	public void setRecpId(int recpId) {
		this.recpId = recpId;
	}
	public int getEmailTxId() {
		return emailTxId;
	}
	public void setEmailTxId(int emailTxId) {
		this.emailTxId = emailTxId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmailRecipient [emailAddress=" + emailAddress + ", status="
				+ status + ", recpId=" + recpId + ", emailTxId=" + emailTxId
				+ "]";
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		
		if(status.equalsIgnoreCase("sending"))
			this.status = "P";
		else if(status.equalsIgnoreCase("sent"))
			this.status = "D";
		else
			this.status = "F";
		
	}
	
	
}
