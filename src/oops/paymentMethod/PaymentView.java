package oops.paymentMethod;

public class PaymentView {
    public PaymentView() {
    }

    public void onPaymentButtonClick(String payment) {
        PaymentMethod paymentMethod = PaymentMethodFactory.getPaymentMethod(payment);
        paymentMethod.makePayment();
    }
}
