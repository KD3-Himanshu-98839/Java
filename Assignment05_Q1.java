import java.util.Scanner;

public class Assignment05_Q1 {
	public static void main(String[] args) {

		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string:");
		string = scanner.nextLine();
		StringBuilder sb1 = new StringBuilder(string);
		
		System.out.println(sb1.reverse().toString());
	}

}
