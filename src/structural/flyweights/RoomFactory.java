package structural.flyweights;

import structural.decorators.BasicRoom;
import structural.decorators.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomFactory {
    private static final Map<String, Room> roomMap = new HashMap<>();

    public static Room getRoom(String type) {
        Room room = roomMap.get(type);
        if (room == null) {
            switch (type) {
                case "Single":
                    room = new BasicRoom();
                    break;
                case "Double":
                    room = new BasicRoom(); // Assuming BasicRoom can act as different types for simplicity
                    break;
                // add other room types as needed
            }
            roomMap.put(type, room);
        }
        return room;
    }
}