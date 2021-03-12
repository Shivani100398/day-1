package com.ibm;

class Book
{
  private String title;

public String getTitle() {
	return title;
}

public void setTitle(String title) throws MyException {
	if(title==null)
	{throw new MyException("Title is Null");}
	
	this.title = title;
	
}	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title;
	}

}



public class Application {
public static void main(String[] args) {
Book book=new Book();
try
{
  book.setTitle("JAVA");	
 }
catch(Exception e)
{
e.printStackTrace();	
}
finally {
	System.out.println("Always");
}
//book.setTitle("Learning Java");
System.out.println(book.toString());
//Book book1=new Book();
//book1.setTitle("Learning JavaScript");
//System.out.println(book1);
}
}
