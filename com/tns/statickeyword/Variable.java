package com.bpal.statickeyword;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1, "Brijesh");
		Student s2 = new Student(2, "Ashish");
		
		s1.display();
		s2.display();

	}

}

class Student{
	int rollno;
	String name;
	static String college = "ITS";
	
	public Student(int no, String name) {
		this.rollno = no;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollno+"  "+name+"  "+college);
	}
}
