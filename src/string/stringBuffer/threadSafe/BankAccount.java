package string.stringBuffer.threadSafe;

public class BankAccount {
    private int balance = 0;
    public synchronized void deposit(int amount) {
        balance += amount;
    }
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable task = () ->{
            for (int i = 0; i < 1000; i++) {
                account.deposit(1);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: "+account.getBalance());
    }

}
