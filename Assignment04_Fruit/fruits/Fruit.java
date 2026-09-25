package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	private  String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public static Scanner sc = new Scanner(System.in);

	public abstract String taste();
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

//	public Fruit(String color, double weight, String name) {
//		this.color = color;
//		this.weight = weight;
//		this.name = name;
//	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public Fruit acceptRecord() {
		System.out.print("Enter Name of Fruit: ");
		setName(sc.next());
		System.out.print("Enter Color of Fruit: ");
		setColor(sc.next());
		System.out.print("Enter Weight of Fruit: ");
		weight = sc.nextDouble();
		setWeight(weight);
	
		setFresh(true);
		return this;
	}
	
	public void printRecord() {
		System.out.println("Name: "+ getName());
		System.out.println("Color: "+ getColor());
		System.out.println("Weight: "+ getWeight());
		System.out.println("IsFresh: "+ isFresh());

	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name  + "]";
	}
	
}
