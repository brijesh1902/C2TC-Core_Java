package overloading;

public class Example1{
    public static void main(String[] args) {
        System.out.println(Adder.add(1, 3));
        System.out.println(Adder.add(2, 3, 5));
    }
}

class Adder{
    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }
}