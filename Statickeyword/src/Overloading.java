
public class Overloading {
public static void main(String[] args) {
	Student1 s1=new Student1();
	s1.study(1,"Maths");
	s1.study(1);
	s1.study();
}
}
class Student1
{
  public void study(int duration,String subject)
  {System.out.println(" Study for.. "+duration+" hours "+subject);}
  public void study(int duration)
  {
	  System.out.println(" Study for.. "+duration+" hours ");
    }
  public void study()
  {System.out.println(("Study...."));}
  


}