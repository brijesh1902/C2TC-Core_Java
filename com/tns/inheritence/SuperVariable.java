package com.bpal.inheritence;

public class SuperVariable {

    public static void main(String[] args) {
        D dog = new D();
        dog.printColor();
    }
}

class A{
    String color = "White";
}

class D extends A{
    String color = "Black";
    void printColor(){
        System.out.println(color); // color => Dog
        System.out.println(super.color); // color => Animal
    }
}
