import java.util.Scanner;

public class Assignment05_Q2 {

	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any String: ");
		string = scanner.nextLine();

		StringBuilder sb1 = new StringBuilder(string);

		String palindromeString = sb1.reverse().toString();

		if (string.equalsIgnoreCase(palindromeString)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
