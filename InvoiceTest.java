package com;

class Invoice {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double priceOfPart;

	public Invoice() {
		partNumber = "";
		partDescription = "";
		quantity = 0;
		priceOfPart = 0.0;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;

		}
	}

	public double getPriceOfPart() {
		return priceOfPart;
	}

	public void setPriceOfPicec(double priceOfPicec) {
		if (priceOfPicec < 0) {
			this.priceOfPart = 0.0;
		} else {
			this.priceOfPart = priceOfPicec;

		}
	}

	public double calculateInvoice() {
		double totalInvoice = this.quantity * this.priceOfPart;
		return totalInvoice;
	}
	
	public void printInvoice() {
		 System.out.println("================ Total Invoice ===========================");
	        System.out.println("Part Number: " + getPartNumber());
	        System.out.println("Part Description: " + getPartDescription());
	        if (getPriceOfPart() == 0.0) {
		        System.out.println("Part Price: " + getPriceOfPart()+" (Note: Reset to 0 due to an invalid negative input)");

			} else {
		        System.out.println("Part Price: " + getPriceOfPart());

			}
	        if (getQuantity() == 0) {
		        System.out.println("Part Quantity: " + getQuantity()+" (Note: Reset to 0 due to an invalid negative input)");

			} else {
				System.out.println("Part Quantity: " + getQuantity() );
			}
	        
	        System.out.println("===========================================");
	        System.out.println("Total Invoice(Amount): " + calculateInvoice());
	        System.out.println();
		
	}
}

public class InvoiceTest{
	public static void main(String[] args) {
		
		Invoice i1 = new Invoice();
		i1.setPartNumber("123456ABCD");
		i1.setPartDescription("It is toyota wheel.");
		i1.setPriceOfPicec(5000.125);
		i1.setQuantity(200);
		
		i1.printInvoice();
		
		Invoice i2 = new Invoice();
		i2.setPartNumber("981010XYZ");
		i2.setPartDescription("It is BMW headlight.");
		i2.setPriceOfPicec(10000.52);
		i2.setQuantity(-2);
		
		i2.printInvoice();
		
		Invoice i3 = new Invoice();
		i3.setPartNumber("5555010XVVDSVZ");
		i3.setPartDescription("It is Harman Kardon 6.5 Inch Car Speaker Combo.");
		i3.setPriceOfPicec(-5000.00);
		i3.setQuantity(-2);
		
		i3.printInvoice();
		
		

	}
}