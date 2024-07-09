package oops.paymentMethod;

public class UnavailablePaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("This method is not available right now. Please check alternate ways.");
    }
}
