package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static Scanner sc = new Scanner(System.in);


	public static  int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Mango.");
		System.out.println("2.Add Orange.");
		System.out.println("3.Add Apple.");
		System.out.println("4.Display names of all fruits in the basket.");
		System.out.println("5. Display fresh fruits");
		System.out.println("6. Display stale fruits");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits as stale");
		System.out.println("--------------------");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void displayAllFruits() {

	}

	public static void main(String[] args) {

		int choice;
		int size;

		System.out.print("Enter the size of basket: ");
		size = sc.nextInt();

		Fruit[] arr = new Fruit[size];
		int indx = 0;


		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1: 
				if (indx < size) {
					Fruit f1 = new Mango();
					arr[indx++] = f1.acceptRecord();
					System.out.println("Mango added successfully.");
				}else {
					System.out.println("Basket is full. Cannot add more fruits.");

				}
				break;
			case 2: 
				if (indx < size) {
					Fruit f2 = new Orange();
					arr[indx++] = f2.acceptRecord();
					System.out.println("Orange added successfully.");

				}else {
					System.out.println("Basket is full. Cannot add more fruits.");

				}
				break;
			case 3: 
				if (indx < size) {
					Fruit f3 = new Apple();
					arr[indx++] = f3.acceptRecord();
					System.out.println("Apple added successfully.");

				}else {
					System.out.println("Basket is full. Cannot add more fruits.");

				}
				break;
			case 4: 
				System.out.println("---- Fruit Names ----");
				for (int i = 0; i < indx; i++) {
					if (arr[i] != null) {
						System.out.println(arr[i].getName());
					}				}
				System.out.println(indx);
				break;
			case 5:
				System.out.println("----- Fresh Fruits ---");
				for (int i = 0; i < indx; i++) {
					if (arr[i] != null && arr[i].isFresh()) {
						System.out.println(arr[i]);
						System.out.print("Weight is: "+arr[i].getWeight());
						System.out.println();
					}
				}
				break;
			case 6:
				System.out.println("----- Stale Fruits ---");
				for (int i = 0; i < indx; i++) {
					if (arr[i] != null && !arr[i].isFresh()) {
						
						System.out.println(arr[i].getName());
						System.out.print("Taste is: "+arr[i].taste());
						System.out.println();
					}
				}
				break;
			case 7:
				System.out.println("----- Stale Marked Fruits ---");
				System.out.print("Enter the index of fruit: ");
				int index = sc.nextInt();
				if (index >=0 && index<indx) {
					arr[index].setFresh(false);
				} else {
					System.out.println("Invalid Index.");
				}
				break;
			case 8:
				System.out.println("----- Mark Fruits ---");
				
				for (int i = 0; i < indx; i++) {
					if (arr[i] != null && arr[i].taste().equals("sour")) {
						System.out.println(arr[i]);
						arr[indx].setFresh(false);
						System.out.println();
					}
				}
				System.out.println("All sour fruits marked as stale.");

				break;
			default:
				System.out.println("Invalid Input.");
			}
		}
	} 
}

