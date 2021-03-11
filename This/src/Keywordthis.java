
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


		public class Student {
		 public Student(String name)
		 {this.name=name;}
			private String name;
		 private Gender gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		 
		}


