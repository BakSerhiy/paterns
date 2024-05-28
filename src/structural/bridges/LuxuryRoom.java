package structural.bridges;

public class LuxuryRoom extends HotelRoom {
    public LuxuryRoom(RoomType roomType) {
        super(roomType);
    }

    @Override
    public void create() {
        System.out.println("Creating luxury room");
        roomType.createRoom();
    }
}