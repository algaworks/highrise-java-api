package com.algaworks.highrisehq;

public class HighriseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int statusCode;
	
	public HighriseException(int statusCode, String message) {
		super(message);
		this.statusCode = statusCode;
	}

	public HighriseException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}