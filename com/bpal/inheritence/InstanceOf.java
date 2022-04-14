package com.bpal.inheritence;

public class InstanceOf extends Test{

    public static void main(String[] args) {
        InstanceOf iOf = new InstanceOf();
        System.out.println(iOf instanceof InstanceOf);

        System.out.println(iOf instanceof Test);

        InstanceOf i = null;
        System.out.println(i instanceof InstanceOf);
    }
    
}

class Test {

}
