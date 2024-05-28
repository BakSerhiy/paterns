package behavioral.state;

public class NewOrderState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order is new and being processed.");
    }
}