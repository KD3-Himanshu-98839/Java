package com.Assignment07_Que1;

public class ExceptionLineTooLong extends Exception {
	private String exceptionString;

	public ExceptionLineTooLong(String exceptionString) {
		this.exceptionString = exceptionString;
	}

	public String getExceptionString() {
		return exceptionString;
	}

	public void setExceptionString(String exceptionString) {
		this.exceptionString = exceptionString;
	}


	@Override
	public String toString() {
		return String.format("%s", exceptionString);
	}
	
}
