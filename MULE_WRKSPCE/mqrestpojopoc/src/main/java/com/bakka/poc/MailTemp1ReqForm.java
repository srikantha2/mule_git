/**
 * @author bakka
 *
 */
package com.bakka.poc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAutoDetect;


@JsonAutoDetect
public class MailTemp1ReqForm implements Serializable{

	private static final long serialVersionUID = -3732769669838353626L;
	private String body;
	private String fromName;
	private String errorEmail;
	private String subject;
	private String fromEmail;
	private List<Recipient> recipients= new ArrayList<Recipient> ();
	
	private Map macros;

	
	
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
	public List<Recipient> getRecipients() {
		return recipients;
	}
	public void setRecipients(List<Recipient> recipients) {
		this.recipients = recipients;
	}
	
	@Override
	public String toString() {
		return "MailTemp1ReqForm [body=" + body + ", fromName=" + fromName
				+ ", errorEmail=" + errorEmail + ", subject=" + subject
				+ ", fromEmail=" + fromEmail + ", recipients=" + recipients
				+ ", macros=" + macros + "]";
	}
	public Map getMacros() {
		return macros;
	}
	public void setMacros(Map macros) {
		this.macros = macros;
	}
	
	
	
	
	

}
