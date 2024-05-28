package structural.decorators;

import structural.decorators.Room;

public class BasicRoom implements Room {
    @Override
    public String getDescription() {
        return "Basic Room";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}