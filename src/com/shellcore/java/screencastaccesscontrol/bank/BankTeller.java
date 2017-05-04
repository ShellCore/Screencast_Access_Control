package com.shellcore.java.screencastaccesscontrol.bank;

/**
 * Created by Cesar. 04/05/2017.
 */
public class BankTeller {

    /**
     * Función para realizar el deposito a la cuenta especificada.
     * @param bankAccount
     * @param amount
     */
    public void deposit(BankAccount bankAccount, double amount) {
        boolean result = bankAccount.deposit(amount);
        if (result) {
            System.out.println("Deposito exitoso: $" + amount);
        } else {
            System.out.println("¡Error en el deposito!");
        }
    }

    /**
     * Función para realizar un retiro a la cuenta especificada
     * @param bankAccount
     * @param amount
     */
    public void withdraw(BankAccount bankAccount, double amount) {
        boolean result = bankAccount.withdraw(amount);
        if (result) {
            System.out.println("Retiro exitoso: $" + amount);
        } else {
            System.out.println("¡Error en el retiro!");
        }
    }
}
