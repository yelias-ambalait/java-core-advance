package oops.paymentMethod;

public class UpayPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Upay Payment Method");
    }
}
