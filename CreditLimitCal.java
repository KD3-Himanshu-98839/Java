package com.creditlimiter;

import java.util.Scanner;

public class CreditLimitCal {
	int accountNo;
	int startingBalance;
	int totalCharges;
	int totalCredit;
	int allowedCreditLimit;

	public CreditLimitCal() {
	}

	public CreditLimitCal(int accountNo, int startingBalance, int totalCharges, int totalCredit,int allowedCreditLimit) {
		this.accountNo = accountNo;
		this.startingBalance = startingBalance;
		this.totalCharges = totalCharges;
		this.totalCredit = totalCredit;
		this.allowedCreditLimit = allowedCreditLimit;
	}


	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getStartingBalance() {
		return startingBalance;
	}

	public void setStartingBalance(int startingBalance) {
		this.startingBalance = startingBalance;
	}

	public int getTotalCharges() {
		return totalCharges;
	}

	public void setTotalCharges(int totalCharges) {
		this.totalCharges = totalCharges;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

	public int getAllowedCreditLimit() {
		return allowedCreditLimit;
	}

	public void setAllowedCreditLimit(int allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}


	public void acceptDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account No: ");
		accountNo = scanner.nextInt();
		setAccountNo(accountNo);

		System.out.println("Starting Balance: ");
		startingBalance = scanner.nextInt();
		setStartingBalance(startingBalance);

		System.out.println("Total charges: ");
		totalCharges = scanner.nextInt();
		setTotalCharges(totalCharges);

		System.out.println("Total credits : ");
		totalCredit = scanner.nextInt();
		setTotalCredit(totalCredit);

		System.out.println("Allowed Credits are : ");
		allowedCreditLimit = scanner.nextInt();
		setAllowedCreditLimit(allowedCreditLimit);

	}


	public int calculateNewBalance() {
		return (this.getStartingBalance() + this.getTotalCharges() - this.getTotalCredit());
	}

	public void checkCreditLimit() {
		if (calculateNewBalance() > getAllowedCreditLimit()) {
			System.out.println("Your Credit limit exceeded.");

		} else {
			System.out.println("Credit is less limit");

		}
	}

	public void display() {
		System.out.println("Account No is: "+accountNo);
		System.out.println("Starting Balance is: "+startingBalance);
		System.out.println("Total Charges are: "+totalCharges);
		System.out.println("Total Credits are: "+totalCredit);
		System.out.println("Allowed Credits are: "+allowedCreditLimit);
		System.out.println("New Balance is: "+calculateNewBalance());	
		this.checkCreditLimit();

	}

	public static void main(String[] args) {
		
		CreditLimitCal c1 = new CreditLimitCal(); 
		
		c1.acceptDetails();
		c1.calculateNewBalance();
		c1.display();

	}

}
