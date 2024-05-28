package structural.decorators;

public class BreakfastDecorator extends RoomDecorator {
    public BreakfastDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return decoratedRoom.getDescription() + ", Breakfast";
    }

    @Override
    public double getCost() {
        return decoratedRoom.getCost() + 20.0;
    }
}