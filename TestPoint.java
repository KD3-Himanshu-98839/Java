package tester;
import java.util.Scanner;

import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Point2D  p1 = new Point2D();
		
		Point2D p2 = new Point2D();
		
		p1.acceptCoordinate();
		p2.acceptCoordinate();
		
		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());


		if (p1.isEqual(p2)) {
			System.out.println("Both points are same.");
		} else {
			p1.calculateDistance(p2);
		}
		

		




	}

}
