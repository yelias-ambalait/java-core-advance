package abstraction;

public abstract class Payment {
    protected double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public abstract void makePayment();

    public void showAmount(){
        System.out.println("Payment amount: "+amount);
    }
}
