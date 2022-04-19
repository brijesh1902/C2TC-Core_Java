package com.bpal.abstraction;

public class Example2 extends Ani_mal {
    
    public static void main(String[] args) {
        Ani_mal ani_mal = new Example2();
        ani_mal.sound();
    }

    @Override
    public void sound() {
        System.out.println("Roar");
    }
}


abstract class Ani_mal{
    public abstract void sound();
}
