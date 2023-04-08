package javaassignment;

public class Student {
	
	private Student() {
		
	}
	
	int rno;
	String name;
	public Student (int r,String n)
	{
		
		rno = r;
		name = n;
	}
	
	public void display()
	{
		System.out.println("ROll No : " +rno);
		System.out.println("Name : " +name);
		
	}
	
	public class demo{
		public static void main(String[] args) {
			Student s1=new Student(1,"Nimisha");
			s1.display();
		}
	}
}
