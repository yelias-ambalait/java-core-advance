package oops.paymentMethod;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "bkash":
                return new BkashPaymentMethod();
            case "nagad":
                return new NagadPaymentMethod();
            case "rocket":
                return new RocketPaymentMethod();
            case "upay":
                return new UpayPaymentMethod();
            case "ucash":
                return new UcashPaymentMethod();
            default:
                return new UnavailablePaymentMethod();
        }
    }
}
