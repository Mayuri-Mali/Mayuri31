package com.digit;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.digit.model.Book;

public class BookMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book=new Book();
		book.setBookName(rs.getString("bookName"));
		book.setBookPrice(rs.getInt("bookPrice"));
		book.setBookISBNCode(rs.getString("bookISBNCode"));
		
		return book;
	}

}