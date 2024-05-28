package behavioral;

import behavioral.observer.Customer;
import behavioral.observer.Store;
import behavioral.strategy.DiscountStrategy;
import behavioral.strategy.RegularCustomerStrategy;
import behavioral.strategy.SeasonalDiscountStrategy;
import behavioral.state.NewOrderState;
import behavioral.state.OrderState;
import behavioral.state.ProcessingOrderState;
import behavioral.state.ShippedOrderState;
import behavioral.command.Command;
import behavioral.command.AddToCartCommand;
import behavioral.command.ApplyDiscountCommand;
import behavioral.template.OrderProcessor;
import behavioral.template.OnlineOrderProcessor;
import behavioral.chainofresponsibility.DiscountHandler;
import behavioral.chainofresponsibility.LoyaltyDiscountHandler;
import behavioral.chainofresponsibility.SeasonalDiscountHandler;
import behavioral.iterator.Cart;
import behavioral.iterator.Iterator;
import behavioral.mediator.CartMediator;
import behavioral.mediator.Mediator;
import behavioral.memento.CartMemento;
import behavioral.memento.CartOriginator;
import behavioral.visitor.CartVisitor;
import behavioral.visitor.DiscountVisitor;
import behavioral.visitor.Product;

public class Main {
    public static void main(String[] args) {
        // Observer
        Store store = new Store();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        store.addObserver(customer1);
        store.addObserver(customer2);

        store.newDiscount("50% off on all items!");

        // Strategy
        DiscountStrategy regularStrategy = new RegularCustomerStrategy();
        DiscountStrategy seasonalStrategy = new SeasonalDiscountStrategy();
        double price = 100.0;

        System.out.println("Regular customer price: " + regularStrategy.applyDiscount(price));
        System.out.println("Seasonal discount price: " + seasonalStrategy.applyDiscount(price));

        // State
        OrderState newState = new NewOrderState();
        OrderState processingState = new ProcessingOrderState();
        OrderState shippedState = new ShippedOrderState();

        newState.handleRequest();
        processingState.handleRequest();
        shippedState.handleRequest();

        // Command
        Command addToCart = new AddToCartCommand("Laptop");
        addToCart.execute();

        Command applyDiscount = new ApplyDiscountCommand(100.0, regularStrategy);
        applyDiscount.execute();

        // Template Method
        OrderProcessor orderProcessor = new OnlineOrderProcessor();
        orderProcessor.processOrder();

        // Chain of Responsibility
        DiscountHandler loyaltyHandler = new LoyaltyDiscountHandler();
        DiscountHandler seasonalHandler = new SeasonalDiscountHandler();

        loyaltyHandler.setNextHandler(seasonalHandler);
        loyaltyHandler.handleDiscount(5);
        loyaltyHandler.handleDiscount(15);

        // Iterator
        Cart<String> cart = new Cart<>();
        cart.addItem("Laptop");
        cart.addItem("Mouse");

        Iterator<String> iterator = cart.iterator();
        while (iterator.hasNext()) {
            System.out.println("Cart item: " + iterator.next());
        }

        // Mediator
        Mediator mediator = new CartMediator();
        mediator.addProduct("Keyboard");
        mediator.applyDiscount(20.0);

        // Memento
        CartOriginator originator = new CartOriginator();
        originator.addItem("Monitor");
        CartMemento memento = originator.save();
        originator.showItems();

        originator.addItem("Printer");
        originator.showItems();

        originator.restore(memento);
        originator.showItems();

        // Visitor
        Product product = new Product("Smartphone", 300.0);
        CartVisitor discountVisitor = new DiscountVisitor();
        product.accept(discountVisitor);
    }
}
