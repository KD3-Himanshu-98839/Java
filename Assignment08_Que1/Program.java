package Assignment08_Que1;

import java.util.Scanner;

public class Program {
	public static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1. Choose Fixed Stack");
		System.out.println("2. Choose Growable Stack");
		System.out.println("Enter your choice.");
		choice = scanner.nextInt();
		return choice;
	}

	public static int menuList2() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1. Add Employee(Push)");
		System.out.println("2. Delete Employee(Pop)");
		System.out.println("3. Display top Emloyee(Peek)");
		System.out.println("Enter your choice.");
		choice = scanner.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Stack stack = null;


		while ((choice = menuList()) != 0) {

			switch (choice) {

			case 1:
				System.out.println("Enter the size of array");
				int size = scanner.nextInt();

				if (stack == null) {

					int choice2;
					stack = new FixedStack(size);

					while ((choice2 = menuList2()) != 0) {
						switch (choice2) {
						case 1:
							Employee employee = new Employee();
							Employee e = employee.acceptRecord();
							stack.push(e);
							break;
						case 2:
							Employee employee2 = stack.pop();
							System.out.println(employee2.getNameString().toUpperCase() + " Deleted");
							break;
						case 3:
							System.out.println((stack.peek()).toString());
							break;

						default:
							System.out.println("Invalid choice");
							break;
						}
					}					
				}
				System.out.println("Stack is already selected.");
				break;

			case 2:
				if (stack == null) {
					stack = new GrowableStack();
					int choice2;

					while ((choice2 = menuList2()) != 0) {
						switch (choice2) {
						case 1:
							Employee employee = new Employee();
							Employee e = employee.acceptRecord();
							stack.push(e);
							break;
						case 2:
							Employee employee2 = stack.pop();
							System.out.println(employee2.getNameString().toUpperCase() + " Deleted");
							break;
						case 3:
							System.out.println((stack.peek()).toString());
							break;

						default:
							System.out.println("Invalid choice");
							break;
						}
					}	


				}
				System.out.println("Stack is already selected.");

				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}
		}

	}

}
