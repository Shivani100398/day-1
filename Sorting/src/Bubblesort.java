
public class Bubblesort {
public static void main(String[] args) {
	int numbers[]= {9,8,5,2,1};
	int c=0;
	for (int i = 0; i < numbers.length-1; i++) {
	   c++;
		for(int j=0;j<numbers.length-(i+1);j++)
		{
			c++;
			if(numbers[j]>numbers[j+1])
			{
				int temp=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=temp;
		         		
				
			}
			
		}
	}
	System.out.println(c);
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
}
}
