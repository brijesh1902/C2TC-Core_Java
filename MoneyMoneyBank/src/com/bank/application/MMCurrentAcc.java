package com.bank.application;

import com.bank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float value) {
        super.withdraw(value);
    }
    
    @Override
    public String toString() {
        return "MMCurrentAcc []";
    }

    
    
}
