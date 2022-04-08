package com.bpal.thiskeyword;

public class Instance_Variable{

    void test(){
        System.out.println(this);
    }
    public static void main(String[] args) {

        Instance_Variable demo = new Instance_Variable();
        System.out.println(demo);
        demo.test();

        Student s1 = new Student(10, "Rakesh", 10000f);
        Student s2 = new Student(15, "Ankit", 6000f);
        s1.display();
        s2.display();
        
    }
}

class Student{
    int rollNo;
    String name;
    float fee;

    Student(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    void display(){
        System.out.println(rollNo+"  "+name+"  $"+fee);
    }
}