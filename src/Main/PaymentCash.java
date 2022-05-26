package Main;

public class PaymentCash extends NewPayment {
    private int amountTendered;

    public PaymentCash (int amount, int amountTendered){
        super(amount);
        this.amountTendered = amountTendered;
    }

    public int calcChange (){
        int change = this.amountTendered - getAmount();
        return change;
    }

    public void DetailPayment(){
        System.out.println("Cash Payment : amount - " + getAmount() + ", Amount Tendered :" + this.amountTendered + " Change :" + calcChange());
    }

}
