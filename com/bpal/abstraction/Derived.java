package com.bpal.abstraction;

public class Derived{

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.fun();
    }
}

abstract class Base{
    void fun(){
        System.out.println("Abstract class metod");
    }
}

class Sub extends Base{ }
