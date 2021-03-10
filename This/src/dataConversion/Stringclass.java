package dataConversion;

public class Stringclass {
	public static void main(String[] args) {
		String s1="IBM";
		String s2="IBM";
		 System. out.println( s1 == s2 );
		String s3=new String("IBM");
		String s4=new String("IBM");
		System.out.println( s1==s3 );
		System.out.println( s3==s4 );
		StringBuilder n1=new StringBuilder("IBM");
		StringBuilder n2=new StringBuilder("IBM");
		 System. out.println( n1 == n2 );
	}
}

