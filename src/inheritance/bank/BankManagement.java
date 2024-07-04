package inheritance.bank;

import java.util.ArrayList;
import java.util.List;

public class BankManagement {
    private List<Account> accounts;

    public BankManagement(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void displayAllAccounts(){
        for(Account account : accounts){
            account.displayAccountDetails();
        }
    }

    public Account findAccount(String accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}
