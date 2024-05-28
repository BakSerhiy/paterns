package creational.observer;

public class TourNotifier extends Subject {
    public void notifyTour(String message) {
        notifyObservers(message);
    }
}