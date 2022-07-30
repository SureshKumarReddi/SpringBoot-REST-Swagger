package com.Suresh.SpringBoot.RestControllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.hateoas.mvc.ControllerLinkBuilder; -used in javatpoint example
//which is deprecated one don't use
//instead use webmvcLinkBuilder

import com.Suresh.SpringBoot.Models.Book;
import com.Suresh.SpringBoot.Models.Books;

@RestController
public class RestController1 {

	@GetMapping(value = "/book/{isbn}", produces = { "application/json" })
	public Book getBook(@PathVariable Integer isbn) {
		Book book = new Book(101, "Core Java", "josh blouch");

		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(RestController1.class).getAllBooks())
				.withRel("All-books");

		book.add(link);

		return book;
	}

	@GetMapping(value = "/all", produces = { "application/json" })
	public List<Book> getAllBooks() {

		Book book1 = new Book(101, "Core Java", "josh blouch");
		Book book2 = new Book(102, "Spring", "Rod Johnson");
		Book book3 = new Book(103, "Hibernate", "Gavin king");
		Book book4 = new Book(104, "Servlets", "someone");

		List<Book> books = Arrays.asList(book1, book2, book3, book4);

		return books;
	}

	/*
	 * @GetMapping(value="/get/{isbn}",produces= {"text/plain"}) public String
	 * getBook(@PathVariable Integer isbn) {
	 * 
	 * Books book = new Books(0102,"Rrod johnson",2123.345);
	 * System.out.println(book); return "success"; }
	 */

}
