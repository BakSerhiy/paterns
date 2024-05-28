package creational.decorator;

import creational.factorymethod.Tour;

public class AirportTransfer extends TourDecorator {
    public AirportTransfer(Tour tour) {
        super(tour);
    }

    @Override
    public String getDescription() {
        return decoratedTour.getDescription() + ", with Airport Transfer";
    }
}