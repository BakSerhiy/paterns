package structural.bridges;

public class SingleRoomType implements RoomType {
    @Override
    public void createRoom() {
        System.out.println("Creating a single room");
    }
}