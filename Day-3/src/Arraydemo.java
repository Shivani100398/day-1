
public class Arraydemo {
	public static void main(String[] args) {
int scores[]=new int[10];
for(int i=0;i<scores.length;i++)
{System.out.println(scores[i]);}
	int numbers[]= {1,2,3,4};
	for(int i=0;i<numbers.length;i++)
	{System.out.println(numbers[i]);}
boolean [] booleans= {true,false};

	for(boolean value:booleans)
	{System.out.println(value);}
	/*String names[]=new String[10];// array object with capacity<=10 of datatype string has been created no string object has been created here.
	
	for (String name : names) {
		//name=new String("Ram");//In heap 10 objects will be created
		name="Ram";//In String pool
		System.out.println(name);
	}*/
	Student[] students=new Student[10];
	for(int i=0; i<students.length ;i++)
	{
		Student student=new Student("Ram"+i);
	students[i]=student;
	if(i==5)
		break;
	}
	System.out.println("Length="+students.length);
	for(int i=0;i<students.length;i++)
	{System.out.println(students[i].getName());}
}
}
	class Student
	{
		public Student(String name) {
			super();
			this.setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;
	
		
		
	}
