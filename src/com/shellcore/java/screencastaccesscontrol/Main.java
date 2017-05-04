package com.shellcore.java.screencastaccesscontrol;

import com.shellcore.java.screencastaccesscontrol.atm.ATM;
import com.shellcore.java.screencastaccesscontrol.bank.BankAccount;
import com.shellcore.java.screencastaccesscontrol.bank.BankTeller;

/**
 * Created by Cesar. 04/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1234, 100.00);
        // bankAccount.balance; // No es alcanzable, y el entorno de desarrollo marca error.
        // a.deposit(100); // No es alcanzable, y el entorno de desarrollo marca error.

        BankAccount bankAccount1 = new BankAccount(4321, 200.00);

        BankTeller bankTeller = new BankTeller();
        bankTeller.deposit(bankAccount, 100.00);

        ATM atm = new ATM(105);
        atm.withdraw(bankAccount1, 100.00);
    }
}
