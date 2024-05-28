package creational.decorator;

import creational.factorymethod.Tour;

public class Insurance extends TourDecorator {
    public Insurance(Tour tour) {
        super(tour);
    }

    @Override
    public String getDescription() {
        return decoratedTour.getDescription() + ", with Insurance";
    }
}