public class Example3 {

    public static void main(String[] args) {
        R16 r = new R16();
        r.engine();
        r.mileage();
    }
}


interface Vehicle{
    void engine();
}

interface Bike extends Veh{
    void mileage();
}

class R16 implements Bike{

    @Override
    public void engine() {
        // TODO Auto-generated method stub
       System.out.println("Fuel injected engine"); 
    }

    @Override
    public void mileage() {
        // TODO Auto-generated method stub
        System.out.println("Mileage is 40");
    }

}