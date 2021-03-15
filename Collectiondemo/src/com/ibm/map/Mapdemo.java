package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.Book;

public class Mapdemo {
private static final String Map = null;
private static final Book Java = null;

public static void main(String[] args) {
	createMapofBooks();
}

private static void createMapofBooks() {
	Map<String, Book>books=new HashMap<String, Book>();
	for(int i=0;i<10;i++)
	{
		Book book1=new Book("Java"+i);
		book1.setPrice(i*100);
		books.put("book"+i,book1);
		
	}
	//Book book1=new Book("Java");
	//books.put("book1", book1 );
books.remove("book5");
System.out.println(books.containsKey("book8"));
	System.out.println(books.size());
	System.out.println(books);
	
}
}
