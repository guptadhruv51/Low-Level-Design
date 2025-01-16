package org.dhruv.Basics.OOPS;

public class Client
{
    public static void main(String[] args) {
        PaymentService ps=new PaymentService();

        ps.addPaymentMethods("DhruvDebitCard",new DebitCard("1234","DhruvGupta"));
        ps.addPaymentMethods("DhruvCreditCard",new CreditCard("123456","DhruvGupta"));
        ps.addPaymentMethods("DhruvUPI",new UPI("DhruvGuptaUPI"));
        ps.makePayment("DhruvDebitCard");
        ps.makePayment("DhruvUPI");
    }
}
