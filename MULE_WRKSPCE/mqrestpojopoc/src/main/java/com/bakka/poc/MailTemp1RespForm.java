/**
 * @author bakka
 *
 */
package com.bakka.poc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class MailTemp1RespForm implements Serializable{

	private static final long serialVersionUID = -3732769669838353626L;
	private String body;
	private String fromName;
	private String errorEmail;
	private String subject;
	private String fromEmail;
	private List<String> recipients= new ArrayList<String> ();
	private int txId;
	private String recipAddr;
	
	
	
	public String getRecipAddr() {
		return "/messages/email/"+getTxId()+"/recipients";
	}
	
	public int getTxId() {
		return txId;
	}
	public void setTxId(int txId) {
		this.txId = txId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getErrorEmail() {
		return errorEmail;
	}
	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public List<String> getRecipients() {
		return recipients;
	}
	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}
	@Override
	public String toString() {
		return "MailTemp1RespForm [body=" + body + ", fromName=" + fromName
				+ ", errorEmail=" + errorEmail + ", subject=" + subject
				+ ", fromEmail=" + fromEmail + ", recipients=" + recipients
				+ ", txId=" + txId + ", recipAddr=" + recipAddr + "]";
	}
	
	
}
