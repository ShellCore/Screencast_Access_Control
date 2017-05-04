package com.shellcore.java.screencastaccesscontrol.atm;

import com.shellcore.java.screencastaccesscontrol.bank.BankAccount;

/**
 * Created by Cesar. 04/05/2017.
 */
public class ATM {

    private int id;

    public ATM(int id) {
        this.id = id;
    }

    public void withdraw (BankAccount bankAccount, double amount) {
        boolean result = bankAccount.withdraw(amount);
        if (result) {
            System.out.println("Retiro exitoso: $" + amount);
        } else {
            System.out.println("¡Error en el retiro!");
        }
    }
}
