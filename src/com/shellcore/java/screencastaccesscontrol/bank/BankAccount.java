package com.shellcore.java.screencastaccesscontrol.bank;

/**
 * Created by Cesar. 04/05/2017.
 */
public class BankAccount {

    public int number;
    private double balance;

    public BankAccount (int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    /**
     * Función para depositar una cantidad mayor que 0 a la cuenta bancaria.
     * @param amount Cantidad a depositar.
     * @return Si la operación fue exitosa, regresa true, en caso contrario, false.
     */
    protected boolean deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Función para poder realizar un retiro de la cuenta bancaria.
     * @param amount Cantidad a retirar.
     * @return Si la cantidad a retirar es menor que lo que hay en la cuenta, regresa true, en caso contrario, false.
     */
    public boolean withdraw (double amount) {
        if (amount > 0 && balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
