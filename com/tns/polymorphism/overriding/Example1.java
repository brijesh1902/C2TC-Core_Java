package overriding;

public class Example1 {
    public static void main(String[] args) {
        Bank bank = new ICICI();
        SBI sbi = new SBI();
        System.out.println("SBI ROI is: "+sbi.getROI());
        System.out.println("ICICI ROI is: "+bank.getROI());
    }
}

class Bank{
    int getROI(){
        return 0;
    }
}

class SBI extends Bank{
    int getROI(){
        return 6;
    }
}

class ICICI extends Bank{
    int getROI(){
        return 7;
    }
}

