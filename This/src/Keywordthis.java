
public class Keywordthis {
		public static void main(String[] args) {
			Student s1=new Student("Ram");
			System.out.println(s1.getName());
			System.out.println(s1. getGender()); 
			
		}
		}

		enum GENDER{
			MALE,FEMALE
			}
        class Student {
		 public Student(String name)
		 {this.name=name;}
			private String name;
		 private GENDER gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public GENDER getGender() {
			return gender;
		}
		public void setGender(GENDER gender) {
			this.gender = gender;
		}
		 
		}


