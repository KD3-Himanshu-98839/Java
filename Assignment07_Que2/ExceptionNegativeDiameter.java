package com.Assignment07_Que2;

public class ExceptionNegativeDiameter extends Exception {
	private String str1;

	public ExceptionNegativeDiameter(String str1) {
		super();
		this.str1 = str1;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	@Override
	public String toString() {
		return String.format("ExceptionNegativeDiameter: %s", str1);
	}

}
