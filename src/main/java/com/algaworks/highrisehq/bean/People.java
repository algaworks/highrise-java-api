package com.algaworks.highrisehq.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="people")
public class People implements Serializable, ListWrapper<Person>{

	private static final long serialVersionUID = 1L;
	
	private List<Person> people;
	
	@XmlElement(name="person")
	public List<Person> getObjects() {
		return people;
	}

	public void setObjects(List<Person> people) {
		this.people = people;
	}

}