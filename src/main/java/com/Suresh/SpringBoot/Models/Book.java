
package com.Suresh.SpringBoot.Models;

import org.springframework.hateoas.RepresentationModel;

public class Book extends RepresentationModel<Book> {

	private Integer isbn;
	private String bookName;
	private String authorName;

	public Book(Integer isbn, String bookName, String authorName) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}

}
