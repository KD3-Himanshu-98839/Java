import java.util.Scanner;
public class Assignment1_Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binary, octal, hexadecimal;
		Integer num;
		System.out.print("Enter the Number: ");
		num = sc.nextInt();
		
		binary = Integer.toBinaryString(num);
		octal = Integer.toOctalString(num);
		hexadecimal = Integer.toHexString(num);
		
		System.out.println("Given number : "+ num);
		System.out.println("Binary equivalent : "+ binary);
		System.out.println("Octal equivalent : "+ octal);
		System.out.println("Hexadecimal equivalent : "+ hexadecimal);

		
	}

}
