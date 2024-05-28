package structural.decorators;

import structural.decorators.Room;

public abstract class RoomDecorator implements Room {
    protected Room decoratedRoom;

    public RoomDecorator(Room room) {
        this.decoratedRoom = room;
    }

    @Override
    public String getDescription() {
        return decoratedRoom.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedRoom.getCost();
    }
}