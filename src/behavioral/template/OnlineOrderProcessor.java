package behavioral.template;

public class OnlineOrderProcessor extends OrderProcessor {
    @Override
    protected void selectItems() {
        System.out.println("Selecting items from online store.");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing online payment.");
    }

    @Override
    protected void shipItems() {
        System.out.println("Shipping items to customer.");
    }
}