package structural.proxies;

import structural.decorators.BasicRoom;
import structural.decorators.Room;

public class RoomProxy implements Room {
    private BasicRoom basicRoom;

    @Override
    public String getDescription() {
        if (basicRoom == null) {
            basicRoom = new BasicRoom();
        }
        return basicRoom.getDescription();
    }

    @Override
    public double getCost() {
        if (basicRoom == null) {
            basicRoom = new BasicRoom();
        }
        return basicRoom.getCost();
    }
}