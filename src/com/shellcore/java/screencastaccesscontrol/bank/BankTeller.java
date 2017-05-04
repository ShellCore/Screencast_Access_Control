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

    public void transfer(BankAccount origin, BankAccount destiny, double amount) {
        if(amount > 0 && (origin.getBalance() / 2) >= amount) {
            boolean resultWithdraw = origin.withdraw(amount);
            boolean resultDeposit = destiny.deposit(amount);
            if (resultWithdraw && resultDeposit) {
                System.out.println("Transferencia exitosa: $" + amount);
            } else {
                System.out.println("¡Error en la transferencia!");
            }
        } else {
            System.out.println("No es posible realizar la transferencia.");
        }
    }
}
