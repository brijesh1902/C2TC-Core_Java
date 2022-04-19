package com.bpal.inheritence;

public class SuperConstructor {

    public static void main(String[] args) {
        new Honda();
        
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle......");
    }
}

class Honda extends Vehicle{
    Honda(){
        super();
        System.out.println("Honda......");
    }
}