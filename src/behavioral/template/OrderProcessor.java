package behavioral.template;

public abstract class OrderProcessor {
    public final void processOrder() {
        selectItems();
        processPayment();
        shipItems();
    }

    protected abstract void selectItems();
    protected abstract void processPayment();
    protected abstract void shipItems();
}