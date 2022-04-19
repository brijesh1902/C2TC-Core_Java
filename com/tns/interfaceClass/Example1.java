public class Example1 {

    public static void main(String[] args) {
        R15 r = new R15();
        r.engine();
    }
    
}

interface Veh{
    void engine();
}

class R15 implements Veh{
    public void engine(){
        System.out.println("I'm engine");
    }
}