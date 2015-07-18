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
public class MailReqForm implements Serializable{

	private static final long serialVersionUID = -3732769669838353626L;
	private String body;
	
	private String from_name;
	private String errors_to;
	private String subject;
	private String from_email;
	private List<Recipient> recipients= new ArrayList<Recipient> ();
	
	private Map macros;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFrom_name() {
		return from_name;
	}

	public void setFrom_name(String from_name) {
		this.from_name = from_name;
	}

	public String getErrors_to() {
		return errors_to;
	}

	public void setErrors_to(String errors_to) {
		this.errors_to = errors_to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFrom_email() {
		return from_email;
	}

	public void setFrom_email(String from_email) {
		this.from_email = from_email;
	}

	public List<Recipient> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<Recipient> recipients) {
		this.recipients = recipients;
	}

	public Map getMacros() {
		return macros;
	}

	public void setMacros(Map macros) {
		this.macros = macros;
	}

	@Override
	public String toString() {
		return "MailReqForm [body=" + body + ", from_name=" + from_name
				+ ", errors_to=" + errors_to + ", subject=" + subject
				+ ", from_email=" + from_email + ", recipients=" + recipients
				+ ", macros=" + macros + "]";
	}

	
	
	
	
	
	

}
