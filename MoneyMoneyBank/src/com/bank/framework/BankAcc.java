package com.bank.framework;

public abstract class BankAcc {

    private int accNo;
    private  String accNm;
    private  float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public void withdraw(float value){
        System.out.println("Rs. "+value+" is withdrawn from the account: "+accNo);
    }

    public void deposit(float value){
        System.out.println("Rs. "+value+" is deposited to the account: "+accNo);
    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", accBal=" + accBal +
                '}';
    }
}