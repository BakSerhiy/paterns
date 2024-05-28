package structural.bridges;

public abstract class HotelRoom {
    protected RoomType roomType;

    public HotelRoom(RoomType roomType) {
        this.roomType = roomType;
    }

    public abstract void create();
}