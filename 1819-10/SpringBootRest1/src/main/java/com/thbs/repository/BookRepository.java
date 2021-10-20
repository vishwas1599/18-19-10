package com.thbs.repository;
import java.util.ArrayList;
import java.util.List;

import com.thbs.model.Book;


public class BookRepository {

	List<Book> blist;
	
	public BookRepository()
	{
		blist =new ArrayList<Book>();
		Book b1=new Book();
		b1.setBookId(111);
		b1.setBookName("APJ");
		b1.setBookPrice(1234);
		
		Book b2=new Book();
		b2.setBookId(11);
		b2.setBookName("AJ");
		b2.setBookPrice(123);
		
		Book b3=new Book();
		b3.setBookId(1211);
		b3.setBookName("AP");
		b3.setBookPrice(134);
		
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		
	}
	
	public List<Book> getAllBooks()
	{
		return blist;
		
	}
	public Book getAbook(int bookId)
	{
		for(Book b:blist)
		{
			if(b.getBookId()==bookId)
				return b;
		}
		return null;
	}
}
