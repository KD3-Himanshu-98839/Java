package Assignment08_Que1;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private  double salary;

	public static Scanner sc = new Scanner(System.in);


	public Employee() {
	}
	public Employee(int id, String nameString, double salary) {
		this.id = id;
		this.name = nameString;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return name;
	}
	public void setNameString(String nameString) {
		this.name = nameString;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee acceptRecord() {

		System.out.print("Enter id: ");
		id = sc.nextInt();

		System.out.print("Enter name: ");
		name = sc.next();

		System.out.print("Enter salary: ");
		salary = sc.nextDouble();

		return this;
	}

	@Override
	public String toString() {
		return "Employee [id= " + id + ", name= " + name + ", salary= " + salary + "]";
	}

}
