// Example of Multiple Inheritence
public class Example5 implements Writes, Reads{
    public static void main(String[] args) {
        Example5 e = new Example5();
        e.write();
        e.read();
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Student reads...");
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        System.out.println("Student writes...");
    }
}

interface Writes{
    void write();
}

interface Reads{
    void read();
}