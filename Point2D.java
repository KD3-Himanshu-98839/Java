package com.app.geometry;
import java.util.Scanner;
public class Point2D {
	double x;
	double y;

	public Point2D() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public Point2D(double x1, double y1) {
		this.x = x1;
		this.y = y1;
	}

	public void acceptCoordinate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coordinates of point P: ");
		System.out.println("Enter x:");
		x = scanner.nextDouble();
		System.out.println("Enter y:");
		y = scanner.nextDouble();
	}

	public String getDetails() {
		return "Co-ordinates of point P: \n x: "+x +" y: "+y;
	}	

	public boolean isEqual(Point2D p2) {
		return this.x == p2.x && this.y == p2.y ;
	}

	public void calculateDistance(Point2D point2d) {
		double x1 = point2d.x - this.x;
		double y1 = point2d.y - this.y;

		double distance = Math.sqrt(
				Math.pow(x1, 2) + Math.pow(y1,2)
		);
		
		System.out.println("Distance between two points is "+distance);
	}


}
