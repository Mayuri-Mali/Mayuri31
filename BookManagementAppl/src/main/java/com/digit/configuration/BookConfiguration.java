package com.digit.configuration;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.digit.BookJdbcTemplate;
import com.digit.model.Book;


//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;

@Configuration
public class BookConfiguration {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dmd=new DriverManagerDataSource();
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/MyDB";
		String uname="postgres";
		String pwd="1234";
		dmd.setDriverClassName(driver);
		dmd.setUrl(url);
		dmd.setUsername(uname);
		dmd.setPassword(pwd);
		
		return dmd;
	}
	
//	@Bean(name="bk")
//	@Scope("prototype")
//	public Book getBook() {
//		
//		 return new Book("Java",350,"BK00234" ,getAuthor());
//	}
	
//	@Bean
//	public Author getAuthor() {
//		return new Author("Balaguruswamy",234,"9876543210");
//	}
	
	@Bean
	public BookJdbcTemplate getJdbcTemplate(DataSource ds) {
		 BookJdbcTemplate bookJdbcTemplate=new  BookJdbcTemplate();
		 bookJdbcTemplate.setDs(ds);
		 return bookJdbcTemplate;
	}
//	@Bean
//    public JdbcTemplate getJdbcTemplate1() {
//        return new JdbcTemplate(getDataSource());
//    }

    @Bean
    public Book getBook() {
        Scanner sc=new Scanner(System.in);
        String bookName=sc.next();
        int bookPrice=sc.nextInt();
        String bookISBNCode=sc.next();
        return new Book(bookName,bookPrice,bookISBNCode);    

    }
	
	
}
