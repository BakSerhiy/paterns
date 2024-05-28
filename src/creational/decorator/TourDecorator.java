package creational.decorator;

import creational.factorymethod.Tour;

public abstract class TourDecorator extends Tour {
    protected Tour decoratedTour;

    public TourDecorator(Tour tour) {
        this.decoratedTour = tour;
    }

    public abstract String getDescription();
}