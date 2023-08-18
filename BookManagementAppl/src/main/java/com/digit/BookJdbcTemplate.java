package com.digit;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.digit.model.Book;



public class BookJdbcTemplate {
	@Autowired
	private DataSource ds;
	private JdbcTemplate jdbcTemplate;
	
	
	public void setDs(DataSource ds) {
	
		this.jdbcTemplate=new JdbcTemplate(ds);
	}
	
	public List<Book>getAllBooks(){
		String query="select * from book";
		List<Book> bookList=jdbcTemplate.query(query,new BookMapper());
		return bookList;
	}
	public void addBook (Book book) {
		String query="insert into book values(?,?,?)";
		jdbcTemplate.update(query,new Object[] {book.getBookName(),book.getBookPrice(),book.getBookISBNCode()});
		System.out.println("record inserted successfully");
	}
	
		
	public void updateBook() {
			
		String query="update book set bookPrice=? where bookISBNCode=?";
	    jdbcTemplate.update(query,new Object[] {350,"ISBN006"});
		System.out.println("updated successfully");
		}
	
	public void deleteBook() {
		
		String query="delete from book where bookISBNCode=?";
	    jdbcTemplate.update(query,new Object[] {"ISBN006"});
		System.out.println("deleted successfully");
		}

}
