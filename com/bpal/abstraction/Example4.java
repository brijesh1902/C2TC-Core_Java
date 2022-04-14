package com.bpal.abstraction;

public class Example4{

    public static void main(String[] args) {
        Mens mens = new Mens();
        mens.type();
    }
}

abstract class Dress{ // class can be either abstract or final
    abstract void type();
}

class Mens extends Dress {

    @Override
    void type() {
        System.out.println("It's a men's wear");
    }
    
}

