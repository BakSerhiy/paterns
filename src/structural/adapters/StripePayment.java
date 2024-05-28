package structural.adapters;


public class StripePayment {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed via Stripe.");
    }
}
