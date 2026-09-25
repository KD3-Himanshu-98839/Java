package com.Assignment07_Que2;

public class Program {
	public static void main(String[] args) {
		try {
			Circle c1 = new Circle();

			System.out.println("X = " + c1.getMyX());
			System.out.println("Y = " + c1.getMyY());
			System.out.println("Diameter = " + c1.getMyDiameter());

			Circle c2 = new Circle(10, 20, -50);

			System.out.println("Diameter = " + c2.getMyDiameter());

		} catch (ExceptionNegativeDiameter e) {
			System.out.println(e.toString());
		}
	}

}
