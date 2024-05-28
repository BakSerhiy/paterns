package behavioral.command;

import behavioral.strategy.DiscountStrategy;

public class ApplyDiscountCommand implements Command {
    private double price;
    private DiscountStrategy strategy;

    public ApplyDiscountCommand(double price, DiscountStrategy strategy) {
        this.price = price;
        this.strategy = strategy;
    }

    @Override
    public void execute() {
        double discountedPrice = strategy.applyDiscount(price);
        System.out.println("Applied discount: new price is " + discountedPrice);
    }
}