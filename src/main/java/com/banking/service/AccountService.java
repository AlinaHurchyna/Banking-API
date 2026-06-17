package com.banking.service;

import com.banking.model.Account;
import com.banking.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AccountService {

    private ArrayList<Account> accounts = new ArrayList<>();
    private Long nextId = 1L;

    public Account createAccount(User owner, String accountNumber) {
        Account account = new Account(nextId++, accountNumber, 0.0, owner);
        accounts.add(account);
        System.out.println("Created: " + account);
        return account;
    }

    public Account findById(Long id) {
        for (Account account : accounts) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        System.out.println("Account not found");
        return null;
    }

    public void printAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found");
            return;
        }
        accounts.forEach(System.out::println);
    }

    public ArrayList<Account> getAllAccounts() {
        return accounts;
    }
}


