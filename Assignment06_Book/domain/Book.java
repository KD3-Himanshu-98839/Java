package domain;

public class Book {
	private int Isbn;
	private String authorName;
	private double price;
	private int quantity;


	public Book() {
	}
	public Book(int isbn, String authorName, double price, int quantity) {
		Isbn = isbn;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;
	}
	public int getIsbn() {
		return Isbn;
	}
	public void setIsbn(int isbn) {
		Isbn = isbn;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj) 
			return true;
		if (!( obj instanceof Book )) 
			return false;
		Book book = (Book) obj;
		return this.Isbn == book.Isbn;
	}
	@Override
	public String toString() {
		return String.format(" [ ISBN: %-9d | Author: %-16s | Price: ₹%-7.2f | Qty: %-3d ]", 
				Isbn, authorName, price, quantity);
	}





}
