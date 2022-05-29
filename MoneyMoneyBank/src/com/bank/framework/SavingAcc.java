package com.bank.framework;

public class SavingAcc extends BankAcc {

    private  boolean isSalaried;
    private static float minBal = 100;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float value) {
        super.withdraw(value);
    }

    @Override
    public String toString() {
        return "SavingAcc{" +
                "isSalaried=" + isSalaried +
                '}';
    }
}
