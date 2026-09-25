package com.Assignment07_Que2;

public class Circle {
	private double myX;
	private double myY;
	private double myDiameter;

	public Circle() {
		myX = 0.0;
		myY = 0.0;
		myDiameter = 100.0;
	}

	public Circle(double myX, double myY, double myDiameter) throws ExceptionNegativeDiameter {

		if (myDiameter < 0) {
			throw new ExceptionNegativeDiameter("Diameter never be negative.");
		}
		this.myX = myX;
		this.myY = myY;
		this.myDiameter = myDiameter;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws ExceptionNegativeDiameter {
		if (myDiameter < 0) {
			throw new ExceptionNegativeDiameter("Diameter never be negative.");
		}
		this.myDiameter = myDiameter;
	}


}
