package oops.abstraction;

public class OnlinePaymentSystem {
    public static void main(String[] args) {

        Payment creditCardPayment = new CreditCardPayment(700," 2014-5866-1925-0145", "Yelias Ahmed");
        creditCardPayment.makePayment();

        Payment bkashPayment = new BkashPayment(250, "01920834881");
        bkashPayment.makePayment();
    }
}
