package com.oops.concepts;

// Example of Encapsulation

public class BankAccount {

    // Private variable to store the balance
    private double balance;

    public BankAccount(double initialBalance) {

        balance = initialBalance;
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Public method to check balance
    public double getBalance() {
        return balance;

    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        // Try to deposit money
        account.deposit(200.0);   // Deposited: 200.0

        // Try to withdraw money
        account.withdraw(100.0);  // Withdrawn: 100.0

        // Check the balance
        System.out.println("Current Balance: " + account.getBalance());  // Current Balance: 600.0

        // Try to withdraw more than the balance
        account.withdraw(700.0);  // Insufficient balance or invalid amount.

    }


}
