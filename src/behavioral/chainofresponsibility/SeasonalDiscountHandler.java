package behavioral.chainofresponsibility;

public class SeasonalDiscountHandler extends DiscountHandler {
    @Override
    public void handleDiscount(double discount) {
        if (discount > 10) {
            System.out.println("Seasonal discount applied: " + discount + "%");
        } else if (nextHandler != null) {
            nextHandler.handleDiscount(discount);
        }
    }
}