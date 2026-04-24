package Polymorphism;

public class Task1 {
    public static void main(String[] args) {
        //Upcasting
        PaymentMethod upi = new UPI();
        PaymentMethod cc = new CreditCard();
        upi.processPayment(1000);
        cc.processPayment(1000);
    }
}
interface PaymentMethod{
    void processPayment(double amount);
}
class UPI implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing via Scanner");
    }
}
class CreditCard implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing via PIN");
    }
}