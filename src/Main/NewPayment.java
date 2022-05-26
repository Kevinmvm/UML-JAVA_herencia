package Main;

abstract public class NewPayment implements IPayment{
    private int amount;

    public NewPayment (int amount){

        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
