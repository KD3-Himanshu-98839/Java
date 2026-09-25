package com.Assignment07_Que1;

import java.util.Scanner;

public class Program  {
	public static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) throws ExceptionLineTooLong {
		String str1;

		System.out.println("Enter a string: ");
		try {
			str1 = scanner.nextLine();

			System.out.println("length of string : "+str1.length());
			if (str1.length() > 80) {
				throw new ExceptionLineTooLong("The Strting is too long..");
			}

		} 
		catch (ExceptionLineTooLong e) {
			System.out.println(e.toString());
		}
	}
}
