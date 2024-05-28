package creational;

import creational.factorymethod.*;
import creational.singleton.*;
import creational.observer.*;
import creational.strategy.*;
import creational.decorator.*;

public class Main {
    public static void main(String[] args) {
        // Factory Method
        TourFactory tourFactory = new TourFactory() {
            @Override
            public Tour createTour() {
                return new BeachTour();
            }
        };
        Tour tour = tourFactory.createTour();
        System.out.println("Created tour: " + tour.getDescription());

        // Singleton
        Database database = Database.getInstance();
        database.connect();

        // Observer
        TourNotifier tourNotifier = new TourNotifier();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        tourNotifier.addObserver(user1);
        tourNotifier.addObserver(user2);
        tourNotifier.notifyTour("New tour available!");

        // Strategy
        RoutePlanner routePlanner = new RoutePlanner();
        routePlanner.setStrategy(new CheapestRouteStrategy());
        routePlanner.planRoute();
        routePlanner.setStrategy(new FastestRouteStrategy());
        routePlanner.planRoute();

        // Decorator
        Tour decoratedTour = new BeachTour();
        decoratedTour = new Insurance(decoratedTour);
        decoratedTour = new ExtraMeals(decoratedTour);
        decoratedTour = new AirportTransfer(decoratedTour);
        System.out.println("Final tour description: " + decoratedTour.getDescription());
    }
}
