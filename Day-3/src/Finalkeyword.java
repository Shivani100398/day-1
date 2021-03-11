
public class Finalkeyword {
public static void main(String[] args) {
	Parent child=new Child();
	child.m1();
}
}
class Parent
{
	void m1()
	{System.out.println("Parent");}
}
class Child extends Parent
{
//void m1()
//{System.out.println("Child");}
}