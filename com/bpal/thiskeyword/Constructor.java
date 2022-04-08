package com.bpal.thiskeyword;

public class Constructor {

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println("************************");
        Demo demo = new Demo(101);
    }
    
}

class Hello{

    Hello(){
        this(5);
        System.out.println("Hello Program A");
    }

    Hello(int i){
        System.out.println(i);
    }
}

class Demo{

    Demo(){
        System.out.println("Hello Program B");
    }

    Demo(int i){
        this();
        System.out.println(i);
    }
}
