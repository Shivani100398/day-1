
public class Varargsdemo {
public static void main(String[] args) {
	int result=add("Shivani",2,3,4,5,6,7,8);
	System.out.println(result);
	
	}		
static int add(String name,int... numbers) {
	int sum=0;
	for(int i=0;i<numbers.length;i++)
	{sum=sum+numbers[i];}
	return sum;

}




}
