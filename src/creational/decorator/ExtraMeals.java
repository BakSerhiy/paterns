package creational.decorator;

import creational.factorymethod.Tour;

public class ExtraMeals extends TourDecorator {
    public ExtraMeals(Tour tour) {
        super(tour);
    }

    @Override
    public String getDescription() {
        return decoratedTour.getDescription() + ", with Extra Meals";
    }
}