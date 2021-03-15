package com.ibm;
import java.util.HashSet;
import java.util.Set;

public class Setdemo {
public static void main(String[] args) {
	createBookSet();
}

private static void createBookSet() {
	Set<Book> books=new HashSet<Book>();
	for (int i = 0; i <10; i++) {
		Book book=new Book("title"+i);
		book.setPrice(100*i);
		book.setPublishYear(i+2000);
		books.add(book);
		books.add(book);
	}
	System.out.println(books);
	System.out.println(books.size());
  }
}
