import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Listdemo {
public static void main(String[] args) {
	//demo1();
	bookList();
	}

private static void bookList()
{
List <Book>books=new ArrayList<Book>();
Book book1=new Book("Learn Java");
book1.setPrice(100.67F);
 book1.setPublishYear(2004);
books.add(book1); 
Book book2=new Book("Teach Java");
book2.setPrice(200.67F);
book2.setPublishYear(2008);
books.add(book2); 

System.out.println(books);
/*books.sort(new Comparator<Book>()
{
	public int compare(Book o1,Book o2)
	{return (int)(book1.getPrice()-book2.getPrice());}
});*/
books.sort(new Comparator<Book>()
{
	public int compare(Book o1,Book o2)
	{return (int)(book1.getPublishYear()-book2.getPublishYear());}
});
System.out.println("After Soring"+books);
   Iterator <Book> it = books.iterator();
		
		/*while(it.hasNext()) {
	Book book = it.next();
	if(book.getTitle().contains("Learn"))
	{System.out.println(book);}*/
//}


}

private static void demo1()
{
	
	List<Integer>list=new ArrayList<Integer>();
	{
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Before=="+list);
		//list.remove(2);
		System.out.println(list.contains(3));
		System.out.println("After=="+list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
		System.out.println(list);

	}
}
}





