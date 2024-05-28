package structural.decorators;

public class WiFiDecorator extends RoomDecorator {
    public WiFiDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return decoratedRoom.getDescription() + ", WiFi";
    }

    @Override
    public double getCost() {
        return decoratedRoom.getCost() + 10.0;
    }
}