package com.algaworks.highrisehq.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="errors")
public class Errors implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String error;

	@XmlElement
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}