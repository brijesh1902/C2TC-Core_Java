package com.bpal.statickeyword;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = new Student1(1, "Brijesh");
		Student1 s2 = new Student1(2, "Ashish");
		s1.change("CHM");
		s1.display();
		s2.change("RKT");
		s2.display();

	}

}

class Student1{
	int rollno;
	String name;
	static String college = "ITS";
	
	public Student1(int no, String name) {
		this.rollno = no;
		this.name = name;
	}
	
	void change(String col_name) {
		college = col_name;
	}
	
	void display() {
		System.out.println(rollno+"  "+name+"  "+college);
	}
}

