package finalKeyword;

public class Example1{

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}

final class Bike{
    final int speed = 90;
    final void run(){
        System.out.println("Speed: "+speed);
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Running.....");
    }
}