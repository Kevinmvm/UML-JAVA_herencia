package Main;

import java.util.ArrayList;

public class NewSale {
    public static void main(String[] args) {

        ArrayList<Sale> arraySale = new ArrayList<Sale>();

        Sale s1  = new Sale("01", "producto 1");
        PaymentCash miNewPayment = new PaymentCash(1000,1500);
        s1.setPayment(miNewPayment);
        // pago en cash pvp = 1000, importe recibido = 1500


        Sale s2  = new Sale("02", "producto 2");
        PaymentCreditCard miNewPayment2 = new PaymentCreditCard(3000, 1234567);
        s2.setPayment(miNewPayment2);
        // pago en credirCard card Number = 1234567 pvp = 3000

        Sale s3  = new Sale("03", "producto 3");
        PaymentCash miNewPayment3 = new PaymentCash(4400,5300);
        s3.setPayment(miNewPayment3);
        // pago en cash pvp = 4400, importe recibido = 5300

        arraySale.add(s1);
        arraySale.add(s2);
        arraySale.add(s3);

        arraySale.stream().forEach((p)-> { p.getPayment().DetailPayment();});

    }
}

/* Que queremos obtener
Cash Payment : amount - 1000, Amount Tendered :1500 Change :500
Credit Card Payment : amount - 3000, Credit Card Number :1234567 authorize : false
Cash Payment : amount - 44000, Amount Tendered :53000 Change :9000
Cash Payment : amount - 1000, Amount Tendered :2000 Change :1000
*/