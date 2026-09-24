package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import util.SortByPriceComparator;

public class Program {
	public static	Scanner scanner = new Scanner(System.in);
	public static List<Book> bookList = new ArrayList<Book>(); 

	public static Book[] getInstance(){
		Book[] arr = new Book[5];
		arr[0] = new Book(4901,"Sudha Murty",   129.29,5);
		arr[1] = new Book(4102,"Robert Martin", 29.99,2);
		arr[2] = new Book(4403,"Arundhati Roy", 250.21,10);
		arr[3] = new Book(4004,"Chetan Bhagat", 53.33,15);
		arr[4] = new Book(4105,"Robert Junior", 3000.99,150);
		return arr;
	}


	public static void AddBooks(Book[] b) {
		for (Book book : b) {
			bookList.add(book);
		}

	}
	public static void DisplayAllBooksInForward() {
		ListIterator<Book> trav =	bookList.listIterator();
		System.out.println("---------------- Forward Traverse ---------------");
		while (trav.hasNext()) {
			Book b1 = trav.next();
			System.out.println(b1.toString());
		}

		System.out.println();
	}

	public static void DisplayAllBooksInReverse() {
		ListIterator<Book> trav = bookList.listIterator(bookList.size());
		System.out.println("---------------- Reverse Traverse ---------------");
		while (trav.hasPrevious()) {
			Book b1 = trav.previous();
			System.out.println(b1.toString());
		}

	}

	public static void acceptRecord(int[] isbn) {
		System.out.println("Enter the Isbn : ");
		isbn[0] = scanner.nextInt(); 
	}

	public static Book findBook(int isbn) {
		Book key = new Book();
		key.setIsbn(isbn);
		int indx = bookList.indexOf(key);
		if (indx != -1) {
			return bookList.get(indx);
		} 
		return null;
	}

	public static void printBook(Book b) {
		if(b != null) 
			System.out.println(b.toString());
		else 
			System.out.println("Book not found");
	}


	public static Boolean DeleteBookByIsbn(int isbn) {
		Book key = new Book();
		key.setIsbn(isbn);
		if (bookList.contains(key)) {
			bookList.remove(key);
			return true;
		}
		return false;
	}

	public static void printAllBooks() {
		for (Book book : bookList) {
			System.out.println(book.toString());
		}

	}


	public static int menuList() {
		int choice;
		System.out.println("-----------------------------------------");
		System.out.println("          BOOK MANAGEMENT SYSTEM         ");
		System.out.println("-----------------------------------------");
		System.out.println(" 0. Exit. ");
		System.out.println(" 1. Add new books to list.");
		System.out.println(" 2. Display all books in Forward Order.");
		System.out.println(" 3. Display all books in Reverse Order.");
		System.out.println(" 4. Find a book with isbn.");
		System.out.println(" 5. Delete a book at given Isbn.");
		System.out.println(" 6. Sort books by price DESC.");

		System.out.println("-----------------------------------------");
		System.out.print(" Enter Your Choice: ");

		choice = scanner.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		int[] isbn = new int[1]; 

		int choice;
		Comparator<Book> comparator = null;

		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				bookList.clear();
				Book[] arr  = Program.getInstance();
				Program.AddBooks(arr);
				break;
			case 2:
				Program.DisplayAllBooksInForward();

				break;
			case 3:
				Program.DisplayAllBooksInReverse();
				break;
			case 4:
				Program.acceptRecord(isbn);
				Book book =  Program.findBook(isbn[0]);
				Program.printBook(book);
				break;
			case 5:
				Program.acceptRecord(isbn);
				Boolean removedStatus =  Program.DeleteBookByIsbn(isbn[0]);
				System.out.println(removedStatus ? "Book removed " : "Book not removed");
				break;
			case 6:
				comparator = new SortByPriceComparator();
				Collections.sort(bookList,comparator);
				System.out.println("---------------- Sort By Price DESC ---------------");
				Program.printAllBooks();
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}



	}

}
