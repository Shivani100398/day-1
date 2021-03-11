
public class Variable {
 int a=0;//instance variable
 void m()
 {
	 int a=10;//local variable
	 System.out.println(this.a);
	 System.out.println(a);
	 
	 
 }
	public static void main(String[] args) {
		Variable variable=new Variable();
		variable.m();
	}
	
}
