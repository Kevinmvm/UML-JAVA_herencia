package Main;

public class Sale {
    private final String id;
    private final String description;
    private NewPayment payment;

    public Sale(String id, String description){
        this.id = id;
        this.description = description;
    }

    public void setPayment(NewPayment pay){
        this.payment = pay;
    }

    public NewPayment getPayment(){
        return this.payment;
    }
}
