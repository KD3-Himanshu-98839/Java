import java.util.Scanner;

public class Assignment05_Q3 {

	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any String: ");
		string = scanner.nextLine();


		StringBuilder sb1 = new StringBuilder(string.trim());
		
		String[] parts = sb1.toString().split(",");

		System.out.println("Total words: "+parts.length);
		
	}

}
