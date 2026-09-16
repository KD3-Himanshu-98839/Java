package com;

class Employee{
	String firstName,lastName;
	double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary < 0) {
			this.monthlySalary = 0;
		} else {
			this.monthlySalary = monthlySalary;
		}
	}
	
	public double calculateYearlySalary() {
		double totalSalary = monthlySalary * 12;
		return totalSalary;
	}
	
	public void increamentInSalary() {
	    this.monthlySalary = this.monthlySalary + (monthlySalary * 0.10) ; 
		System.out.println("New Updated Monthly salary is :"+monthlySalary);
		System.out.println("New Updated Yearly salary is :"+calculateYearlySalary());
		System.out.println();
		
	}
	
	public void printEmployeeDetails() {

	        System.out.println("Employee Full Name : " +getFirstName()+" " +getLastName() );
	        System.out.println("Employee's Monthly Salary : " +getMonthlySalary() );
	        System.out.println("Employee's Yearly Salary : " +calculateYearlySalary() );
	        System.out.println();	
	}

}


public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee  employee1 = new Employee("Geetish", "Mahato", 20000.00);
		
		employee1.printEmployeeDetails();
		employee1.calculateYearlySalary();
		
		employee1.increamentInSalary();
	
		
		
        Employee  employee2 = new Employee("Arnav", "Kumar", 60000.00);
		
        employee2.printEmployeeDetails();
        employee2.calculateYearlySalary();
		
        employee2.increamentInSalary();
	
		

	}

}
