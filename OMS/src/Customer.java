
public class Customer
{
  public static void main(String[] args) 
  {
	
	  for(int i=0;i<10;i++)
	  {
		  Order order=new Order("Ram"+i);
		    
	  }
	System.out.println(order.getName());
	  
	    
  }	
}

enum ORDER
{SMARTPHONE,SMARTWATCH,EARPHONES,IPHONE,IWATCH}
public class Define{
	
	
    private String name;
    private STATUS status;

public Define(String name) {
	 
	}

public String getName() {
	return name;
}

public void setName(String name) {
	if(name==null || name.trim().equals(""))
	{
		
		throw new IllegalArgumentException("Name is Mandatory");
		
	}
	this.name = name;
}
public STATUS getStatus() {
	return status;
}

public void setStatus(Stack status) {
	this.status = status;
}

}