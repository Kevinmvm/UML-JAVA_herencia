package Main;

public class PaymentCreditCard extends NewPayment {
    private int cardNumber;
    public PaymentCreditCard (int amount, int cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    public boolean autorize() {
            return false;
    }

    public void DetailPayment() {
        System.out.println("Credit Card Payment : amount - " + getAmount() + ", Credit Card Number :" + this.cardNumber + " authorize : " + autorize());
    }

}

