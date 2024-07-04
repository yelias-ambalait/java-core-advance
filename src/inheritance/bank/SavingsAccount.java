package inheritance.bank;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest(){
        double interest = getBalance()*(interestRate/100);
        deposit(interest);
        System.out.println("Interest is added. New balance: " + getBalance());
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account details");
        System.out.println("Account number: " + getAccountNumber()+ "\nAccount holder: " + getAccountHolderName()+ "\nBalance: " + getBalance()+"\nInterest rate: "+interestRate+"%\n");
    }
}
