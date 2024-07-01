package paymentMethod;

public class UcashPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Ucash Payment Method");
    }
}
