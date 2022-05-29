package com.bank.application;

import com.bank.framework.BankFactory;
import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

    @Override
    public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        SavingAcc acc = new SavingAcc(accNo, accNm, accBal, isSalaried);
        return acc;
    }

    @Override
    public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        CurrentAcc acc = new CurrentAcc(accNo, accNm, accBal, creditLimit);
        return acc;
    }
    
}
