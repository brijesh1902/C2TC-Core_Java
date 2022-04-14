package com.bpal.abstraction;

public class Example3 extends A {
    
    public static void main(String[] args) {
        Example3 example = new Example3();
        example.method();
        example.normal();
    }

    @Override
    void method() {
        System.out.println("I am Spiderman");
    }
}

abstract class A {
    abstract void method();

    public void normal(){
        System.out.println("I am inevitable");
    }
}
