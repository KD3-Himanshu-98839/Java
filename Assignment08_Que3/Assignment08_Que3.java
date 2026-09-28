package Assignment08_Que3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment08_Que3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3,4,5,6));
		System.out.println("Original List: "+list.toString());
		System.out.println("Enter a number to replace with second element");
		list.set(1, scanner.nextInt());
		System.out.println("After Replace: "+list.toString());
	}

}
