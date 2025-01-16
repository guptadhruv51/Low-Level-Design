package BehaviouralPatterns.StrategyPattern;
interface PaymentStrategy
{
    void processPayment();
}
class DebitCard implements  PaymentStrategy
{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment using DebitCard");
    }
}
class CreditCard implements PaymentStrategy
{
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Credit Card");
    }
}
class PaymentService
{
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }
    public void pay()
    {
        paymentStrategy.processPayment();
    }
}
public class StrategyPattern
{

    public static void main(String[] args) {
        DebitCard debitCard=new DebitCard();
        PaymentService paymentService=new PaymentService();
        paymentService.setPaymentStrategy(debitCard);
        paymentService.pay();
        PaymentStrategy creditCard=new CreditCard();
        paymentService.setPaymentStrategy(creditCard);
        paymentService.pay();
    }
}
