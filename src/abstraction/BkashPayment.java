package abstraction;

public class BkashPayment extends Payment{
    private String bkashNumber;

    public BkashPayment(double amount, String bkashNumber){
        super(amount);
        this.bkashNumber = bkashNumber;
    }


    @Override
    public void makePayment() {
        System.out.println("bKash payment is processing of bearing bkash number: " + bkashNumber);
        showAmount();
    }
}
