package com.banking.model;


public class Account {
    private Long id;
    private String accountNumber;
    private double balance;
    private User owner;

    public Account(Long id, String accountNumber, double balance, User owner) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // amount положительный И денег хватает
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Amount must be greater than zero!");
        }
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", Number=" + accountNumber + ", balance=" + balance + ", owner=" + owner + '}';
    }
}
