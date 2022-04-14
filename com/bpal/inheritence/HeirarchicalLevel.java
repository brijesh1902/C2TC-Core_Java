package com.bpal.inheritence;

public class HeirarchicalLevel {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("********* CAT ***********");
        cat.eat();
        cat.meow();
        Dog dog = new Dog();
        System.out.println("********* DOG ************");
        dog.eat();
        dog.bark();
    }
    
}

class Animal{
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing....");
    }
}
