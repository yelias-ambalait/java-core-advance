package oops.paymentMethod;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Payment Method: ");
        String paymentType = s.next();
        PaymentView paymentView = new PaymentView();
        paymentView.onPaymentButtonClick(paymentType);
    }
}
