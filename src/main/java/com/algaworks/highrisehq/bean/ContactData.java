package com.algaworks.highrisehq.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class ContactData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	
	@XmlElementWrapper(name="email-addresses")
	@XmlElement(name="email-address")
	public List<EmailAddress> getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(List<EmailAddress> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	@XmlElementWrapper(name="phone-numbers")
	@XmlElement(name="phone-number")
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void addPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumbers.add(phoneNumber);
	}
	
	public void addEmailAddress(EmailAddress emailAddress) {
		this.emailAddresses.add(emailAddress);
	}
	
}