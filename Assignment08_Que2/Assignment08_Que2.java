package Assignment08_Que2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SuppressWarnings("resource")
public class Assignment08_Que2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("Enter the number of color you want to add:");
		int n = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Add "+n+" colors.");
		for (int i = 0; i <n; i++) {
			list.add(scanner.nextLine());
		}
		System.out.println("Original list: "+list.toString());

		list.sort((x,y) -> x.compareTo(y));

		System.out.println("Sorted list: "+list.toString());
	}

}
