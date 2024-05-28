package behavioral.strategy;

public class RegularCustomerStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.90; // 10% discount
    }
}