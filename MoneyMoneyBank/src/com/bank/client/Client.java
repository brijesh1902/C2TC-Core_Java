package com.bank.client;

import com.bank.application.MMCurrentAcc;
import com.bank.application.MMSavingAcc;
import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingAcc;

public class Client {

    public static void main(String[] args) {

        System.out.println("-------- Saving Account ---------");

        SavingAcc savingAcc = new MMSavingAcc(1001, "Brijesh", 10000f, false);
        savingAcc.withdraw(1500f);
        savingAcc.deposit(2000f);
        savingAcc.toString();

        System.out.println("\n-------- Current Account ---------");

        CurrentAcc currentAcc = new MMCurrentAcc(1005, "Raj", 20000f, 15000f);
        currentAcc.withdraw(6000f);
        currentAcc.deposit(15000f);
        currentAcc.toString();
        
    }

}