package com.bpal.thiskeyword;

public class Argument_Method {

    public static void main(String[] args) {
        Arg arg = new Arg();
        arg.call();
    }
    
}

class Arg{

    void display(Arg a){
        System.out.println("Method is invoked: "+a);
    }

    void call(){
        display(this);
    }

}
