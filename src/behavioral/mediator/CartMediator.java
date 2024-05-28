package behavioral.mediator;

import behavioral.command.AddToCartCommand;
import behavioral.command.ApplyDiscountCommand;
import behavioral.strategy.DiscountStrategy;
import behavioral.strategy.RegularCustomerStrategy;

public class CartMediator implements Mediator {
    @Override
    public void addProduct(String product) {
        new AddToCartCommand(product).execute();
    }

    @Override
    public void applyDiscount(double discount) {
        DiscountStrategy strategy = new RegularCustomerStrategy();
        new ApplyDiscountCommand(discount, strategy).execute();
    }
}