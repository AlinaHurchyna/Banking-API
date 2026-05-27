package com.banking.model;

public class Transaction {
    private Long id;
    private Account account;
    private double amount;
    private TransactionType type;
    private String date;

    public Transaction(Long id, Account account, double amount, TransactionType type, String date) {
        this.id = id;
        this.account = account;
        this.amount = amount;
        this.type = type;
        this.date = date;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", type=" + type +
                ", date=" + date +
                ", account=" + account.getAccountNumber() +
                "}";
    }
}

