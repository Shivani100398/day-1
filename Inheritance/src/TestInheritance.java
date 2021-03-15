class Animal
{
 void bark()
 {System.out.println("Barking");}
 
}
class Dog extends Animal
{
 void eat()
 {System.out.println("eating");}

}
/*class BabyDog extends Animal
{
 void weep()
 {System.out.println("Weeping");}

}*/


public class TestInheritance {
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.bark();
	dog.eat();
	//dog.weep();
}
}
