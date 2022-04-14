package com.bpal.thiskeyword;

public class Argument_Constructor {

    public static void main(String[] args) {
        new A();
    }
    
}

class A{
    int i = 10;

    A(){
        B b = new B(this);
        b.display();
    }
}

class B{
    A a;
    B(A a){
        this.a = a;
    }

    void display(){
        System.out.println("Passing argument in the Constructor call: "+a.i);
    }
}
