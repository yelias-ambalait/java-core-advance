package exceptions.mixedTypeException;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            bank.createAccount("111189895300", 500);
            bank.createAccount("111199896300", 500);

            bank.deposit("111199896300", 700);
            System.out.println("Current balance of 111199896300 after deposit: "+bank.getBalance("111199896300"));

            bank.withdraw("111199896300", 300);
            System.out.println("Current balance of 111199896300 after withdraw: "+bank.getBalance("111199896300"));

            bank.transfer("111199896300", "111189895300", 200);
            System.out.println("Balance of 111199896300 after transfer: "+bank.getBalance("111199896300"));
            System.out.println("Balance of 111189895300 after transfer: "+bank.getBalance("111189895300"));

            bank.deposit("111568968", 500);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.err.println("Error: "+e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: "+e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }

    }
}
