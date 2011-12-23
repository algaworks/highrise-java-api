package com.algaworks.highrisehq.bean;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String firstName;
	private String lastName;
	private String background;
        private Long companyId;
	private ContactData contactData = new ContactData();

	@XmlElement(name="first-name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@XmlElement(name="id")
	public Long getId() {
		return id;
	}
        
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement(name="last-name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

        @XmlElement(name="company-id")
        public Long getCompanyId() {
            return companyId;
        }

        public void setCompanyId(Long companyId) {
            this.companyId = companyId;
        }
	
	@XmlElement(name="contact-data")
	public ContactData getContactData() {
		return contactData;
	}
	public void setContactData(ContactData contactData) {
		this.contactData = contactData;
	}
	
        @XmlElement(name="background")
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", background=" + background + ", contactData=" + contactData + '}';
    }
	
}