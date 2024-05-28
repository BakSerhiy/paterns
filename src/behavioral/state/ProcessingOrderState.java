package behavioral.state;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order is being processed.");
    }
}