package com.bank.framework;

import java.util.stream.Stream;

public class CurrentAcc extends BankAcc{

    private final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float value) {
        super.withdraw(value);
        System.out.println("Your remaining Credit limit is Rs. "+creditLimit);
    }

    @Override
    public String toString() {
        return "CurrentAcc{" +
                "creditLimit=" + creditLimit +
                '}';
    }
}
