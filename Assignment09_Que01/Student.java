package Assignment09_Que01;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private double marks;

	public static Scanner sc = new Scanner(System.in);

	public Student() {

	}
	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Student acceptRecord() {
		System.out.print("Enter Roll-No: ");
		setRollNo(sc.nextInt());
		sc.nextLine();

		System.out.print("Enter  Name: ");
		setName(sc.nextLine());

		System.out.print("Enter Marks: ");
		marks = sc.nextDouble();
		setMarks(marks);

		return this;
	}

	public void printRecord() {
		System.out.println("Roll No: "+ getRollNo());
		System.out.println("Name: "+ getName());
		System.out.println("Marks: "+ getMarks());

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (! (obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj; //downcast
		return this.rollNo == other.rollNo;
	}

	@Override
	public String toString() {
		return String.format("%-20d%-15s%-10.2f", rollNo, name, marks);
	}

}
