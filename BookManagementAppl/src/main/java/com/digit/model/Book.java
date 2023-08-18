package com.digit.model;

import org.springframework.beans.factory.annotation.Autowired;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;

public class Book {
	private String bookName;
	private double bookPrice;
	private String bookISBNCode;
//	@Autowired
//	private Author author;
//	
//	public Author getAuthor() {
//		return author;
//	}
//	public void setAuthor(Author author) {
//		this.author = author;
//	}
	public Book(String bookName, double bookPrice, String bookISBNCode) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookISBNCode = bookISBNCode;
		//this.author = author;
	
	}
	public Book() {
		super();
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookISBNCode() {
		return bookISBNCode;
	}
	public void setBookISBNCode(String bookISBNCode) {
		this.bookISBNCode = bookISBNCode;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookISBNCode=" + bookISBNCode
				+ "]";
	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("invoking post construct");
//	}
//	
//	@PreDestroy
//	public void invokePreDestroy() {
//		System.out.println("invoking pre destroy");
//	}

	

}
