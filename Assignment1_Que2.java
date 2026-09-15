import java.util.Scanner;

public class Assignment1_Que2 {

	public void printAverage(double n1, double n2) {

		double res = (n1 + n2) / 2;
		System.out.print("Average of " + n1 + " and " + n2 + " numbers is: " + res);

	}

	public static void main(String[] args) {
		Assignment1_Que2 q2 = new Assignment1_Que2();
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;

		System.out.println("Enter two Double/Decimal numbers:");

		System.out.println("Enter 1st number:");
		if (sc.hasNextDouble()) {
			if (!sc.hasNextInt()) {
				num1 = sc.nextDouble();
				System.out.println("Enter 2st number:");
				if (sc.hasNextDouble()) {
					if (!sc.hasNextInt()) {
						num2 = sc.nextDouble();
						q2.printAverage(num1, num2);
					} else {
						System.out.println("You Entered invalid value , please enter decimal value ex-10.5");
					}
				}
				
			} else {
				System.out.println("You Entered invalid value , please enter decimal value ex-10.5");
			}

		}

	}

}
