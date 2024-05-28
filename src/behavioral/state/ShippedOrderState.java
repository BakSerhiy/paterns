package behavioral.state;

public class ShippedOrderState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order has been shipped.");
    }
}