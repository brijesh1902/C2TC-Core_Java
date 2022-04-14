package com.bpal.inheritence;

public class SuperMethod {

    public static void main(String[] args) {
        Screw screw = new Screw();
        screw.work();
    }
    
}

class Machine {
    void eat(){
        System.out.println("eating......");
    }
}

class Screw extends Machine{
    void eat(){
        System.out.println("eating bread.....");
    }

    void bark(){
        System.out.println("barking.....");
    }

    void work(){
        super.eat();
        bark();
    }
}