package com.bpal.abstraction;

public class Example1 {

    public static void main(String[] args) {
        Animal goat = new Herbivores();
        Animal tiger = new Carnivores();
        Animal bear = new Omnivores();
        goat.eat();
        tiger.eat();
        bear.eat();
    }
}

abstract class Animal{
    abstract void eat();
}

class Herbivores extends Animal{

    @Override
    void eat() {
        System.out.println("I'm vegetarian");
    }

}

class Carnivores extends Animal{
    void eat(){
        System.out.println("I'm Non-vegetarian");
    }
}

class Omnivores extends Animal{

    @Override
    void eat() {
       System.out.println("I'll eat both veg and non-veg");
    }

}