
public class Assignment
{
	public static void main(String[] args) 
	{
		for(int i=0;i<6;i++)
		{
		for(int j=0;j<i;j++)
		 {
			System.out.print("*"+" ");
		 }
		System.out.println();
			
		}
		
		   int a = 1 || 2 ^ 3 && 5;
		    int b = ((1 || 2) ^ 3) && 5;
		    int c = 1 || (2 ^ (3 && 5));
		    System.out.print(a + "," + b + "," + c);
		
    }	
}
