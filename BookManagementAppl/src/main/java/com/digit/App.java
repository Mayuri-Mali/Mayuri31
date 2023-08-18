package com.digit;
import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.digit.configuration.BookConfiguration;
import com.digit.model.Book;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(BookConfiguration.class);
        Book book=(Book) context.getBean(Book.class);
       // System.out.println(book.hashCode());
        
       // Book book1=(Book) context.getBean(Book.class);
        //System.out.println(book1.hashCode());
        //System.out.println(book);
        
        BookJdbcTemplate bookJdbcTemplate=context.getBean(BookJdbcTemplate.class);
        List<Book> slist=bookJdbcTemplate.getAllBooks();
//        for(Book s:slist)
//            System.out.println(s);
        
        
        System.out.println("Before insert");
         List<Book> slist1=bookJdbcTemplate.getAllBooks();
         for(Book s:slist1)
         System.out.println(s);

        
         Book bk=context.getBean(Book.class);
         bookJdbcTemplate.addBook(bk);

         
        System.out.println("after insert");
        slist1=bookJdbcTemplate.getAllBooks();
        System.out.println(slist1);
        for (Book s:slist1)
        	System.out.println(s);
        
        bookJdbcTemplate.updateBook();
        System.out.println("after updation");
        List<Book> slist2=bookJdbcTemplate.getAllBooks();
        for (Book s:slist2)
        	System.out.println(s);
        
        bookJdbcTemplate.deleteBook();
        System.out.println("after deletion");
        List<Book> slist3=bookJdbcTemplate.getAllBooks();
        for (Book s:slist3)
        	System.out.println(s);
        
    }
}
