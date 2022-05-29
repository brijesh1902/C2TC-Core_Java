package com.bank.application;

import com.bank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
    public static final int minBal = 100;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float value) {
        super.withdraw(value);
    }

    @Override
    public String toString() {
        return "MMSavingAcc{}";
    }
}