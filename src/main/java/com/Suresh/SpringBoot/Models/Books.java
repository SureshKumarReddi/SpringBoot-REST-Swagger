package com.Suresh.SpringBoot.Models;

public class Books {

	private Integer isbn;
	private String authorName;
	private Double price;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(Integer isbn, String authorName, Double price) {
		super();
		this.isbn = isbn;
		this.authorName = authorName;
		this.price = price;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", authorName=" + authorName + ", price=" + price + "]";
	}
	
	
}
