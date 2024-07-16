package wrapperClass.BankAccountManagementSystem;

import java.util.*;

public class Bank {
    private Map<Integer, Account> accounts = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();
    private Integer transactionCounter = 1001;

    public void createAccount(Integer accountNumber, String accountHolder, Double initialBalance) {
        Account account = new Account(accountNumber, accountHolder, initialBalance);
        accounts.put(accountNumber, account);
    }

    public void deposit(Integer accountNumber, Double amount ) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            transactions.add(new Transaction(transactionCounter++, accountNumber, amount, new Date(), "DEPOSIT"));
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(Integer accountNumber, Double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            transactions.add(new Transaction(transactionCounter++, accountNumber, amount, new Date(), "WITHDRAW"));
        } else {
            System.out.println("Account not found");
        }
    }

    public Double getBalance(Integer accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found");
            return null;
        }
    }

    public List<Transaction> getTransactionHistory(Integer accountNumber) {
        List<Transaction> transactionList = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getAccountNumber().equals(accountNumber)) {
                transactionList.add(transaction);
            }
        }
        return transactionList;
    }

}
