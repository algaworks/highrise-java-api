package com.algaworks.highrisehq.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * 
 * @author thiagofa
 *
 */
public class ContactData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	private List<WebAddress> webAddresses = new ArrayList<WebAddress>();
        private List<Address> addresses = new ArrayList<Address>();
	
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

	@XmlElementWrapper(name="web-addresses")
	@XmlElement(name="web-address")
        public List<WebAddress> getWebAddresses() {
            return webAddresses;
        }

        public void setWebAddresses(List<WebAddress> webAddresses) {
            this.webAddresses = webAddresses;
        }

	@XmlElementWrapper(name="addresses")
	@XmlElement(name="address")
        public List<Address> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<Address> addresses) {
            this.addresses = addresses;
        }

	public void addPhoneNumber(PhoneNumber phoneNumber) {
            if (phoneNumber.getNumber() != null)
		this.phoneNumbers.add(phoneNumber);
	}
	
	public void addEmailAddress(EmailAddress emailAddress) {
            if (emailAddress.getAddress() != null)
		this.emailAddresses.add(emailAddress);
	}
        
        public void addWebAddress(WebAddress webAddress) {
            if (webAddress.getUrl() != null)
                this.webAddresses.add(webAddress);
        }
	
        public void addAddress(Address address) {
            if (address.getStreet() != null)
                this.addresses.add(address);
        }
}