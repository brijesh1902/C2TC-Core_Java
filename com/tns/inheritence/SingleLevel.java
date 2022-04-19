package com.bpal.inheritence;

public class SingleLevel {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        
    }
    
}

class Animal{
    public void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Barking....");
    }
}
