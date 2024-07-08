package abstraction;

public class CreditCardPayment extends Payment{

    private String cardNumber;
    private String cardHolderName;
    public CreditCardPayment(double amount, String cardNumber, String cardHolderName){
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void makePayment() {
        System.out.println("CreditCardPayment is processing bearing card holder name " +cardHolderName+ " and card number is " +cardNumber);
        showAmount();
    }
}
