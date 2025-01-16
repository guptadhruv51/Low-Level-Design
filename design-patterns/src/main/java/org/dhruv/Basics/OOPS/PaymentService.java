package org.dhruv.Basics.OOPS;

import java.util.HashMap;

public class PaymentService
{
    //Store
    //Making payments

    HashMap<String,PaymentMethod> paymentMethods;

    PaymentService()
    {
        paymentMethods=new HashMap<>();
    }

    public void addPaymentMethods(String name, PaymentMethod pm)
    {
            paymentMethods.put(name,pm);
    }
    public void makePayment(String name)
    {
        PaymentMethod pm=paymentMethods.get(name);
        pm.pay();
    }
}
