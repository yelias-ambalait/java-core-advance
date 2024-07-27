package exceptions.mixedTypeException;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    Map<String, Account> accounts = new HashMap<String, Account>();
    public  void createAccount(String accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account number already exists.");
        }
        accounts.put(accountNumber, new Account(accountNumber, initialBalance));
    }
    public void deposit(String accountNumber, double amount) throws AccountNotFoundException {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }
    public void withdraw(String accountNumber, double amount) throws AccountNotFoundException, InsufficientBalanceException {
        Account account  = findAccount(accountNumber);
        account.withdraw(amount);
    }
    public void transfer(String fromAccount, String toAccount, double amount) throws AccountNotFoundException, InsufficientBalanceException {
        Account sourceAccount = findAccount(fromAccount);
        Account destinationAccount = findAccount(toAccount);
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
    }
    private Account findAccount(String accountNumber) throws AccountNotFoundException{
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Account number "+accountNumber+" not found");
        }
        return account;
    }
    public double getBalance(String accountNumber) throws AccountNotFoundException {
        Account account = findAccount(accountNumber);
        return account.getBalance();
    }
}
