package org.dhruv.Basics.OOPS;

public class UPI  implements  PaymentMethod
{
    String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via "+upiId);
    }
}
