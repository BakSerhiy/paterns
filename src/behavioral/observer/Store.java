package behavioral.observer;

public class Store extends Subject {
    public void newDiscount(String discount) {
        notifyObservers("new discount: " + discount);
    }
}