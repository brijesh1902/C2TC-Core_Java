public class Example2 {

    public static void main(String[] args) {
        Bank bank = new SBI();
        System.out.println("ROI is: "+bank.ROI());
    }
    
}


interface Bank{
    float ROI();
}

class SBI implements Bank{

    @Override
    public float ROI() {
        // TODO Auto-generated method stub
        return 9.15f;
    }
}

class HDFC implements Bank{

    @Override
    public float ROI() {
        // TODO Auto-generated method stub
        return 9.5f;
    }

}