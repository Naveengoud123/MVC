package com.google;

import org.springframework.stereotype.Component;

@Component
public class MailServerDetails {
	
	private String hostName;
	private String contactMail;
	
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getContactMail() {
		return contactMail;
	}
	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}

}
