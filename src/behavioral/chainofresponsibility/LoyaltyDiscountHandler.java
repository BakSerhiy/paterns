package behavioral.chainofresponsibility;

public class LoyaltyDiscountHandler extends DiscountHandler {
    @Override
    public void handleDiscount(double discount) {
        if (discount <= 10) {
            System.out.println("Loyalty discount applied: " + discount + "%");
        } else if (nextHandler != null) {
            nextHandler.handleDiscount(discount);
        }
    }
}