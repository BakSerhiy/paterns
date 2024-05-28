package structural;


import structural.adapters.ExternalPaymentSystem;
import structural.adapters.StripePayment;
import structural.adapters.StripePaymentAdapter;
import structural.composites.HotelComponent;
import structural.composites.RoomComposite;
import structural.composites.SingleRoom;
import structural.decorators.BasicRoom;
import structural.decorators.BreakfastDecorator;
import structural.decorators.Room;
import structural.decorators.WiFiDecorator;
import structural.facades.BookingFacade;
import structural.proxies.RoomProxy;
import structural.bridges.HotelRoom;
import structural.bridges.LuxuryRoom;
import structural.bridges.RoomType;
import structural.bridges.SingleRoomType;
import structural.flyweights.RoomFactory;

public class Main {
    public static void main(String[] args) {
        // Adapter Pattern
        ExternalPaymentSystem paymentSystem = new StripePaymentAdapter(new StripePayment());

        // Decorator Pattern
        Room basicRoom = new BasicRoom();
        Room wifiRoom = new WiFiDecorator(basicRoom);
        Room deluxeRoom = new BreakfastDecorator(wifiRoom);

        // Composite Pattern
        HotelComponent room1 = new SingleRoom("101");
        HotelComponent room2 = new SingleRoom("102");
        RoomComposite composite = new RoomComposite();
        composite.addComponent(room1);
        composite.addComponent(room2);

        // Facade Pattern
        BookingFacade bookingFacade = new BookingFacade(deluxeRoom, paymentSystem);

        // Proxy Pattern
        Room proxyRoom = new RoomProxy();

        // Bridge Pattern
        RoomType singleRoomType = new SingleRoomType();
        HotelRoom luxuryRoom = new LuxuryRoom(singleRoomType);

        // Flyweight Pattern
        Room flyweightRoom = RoomFactory.getRoom("Single");

        // Demonstrating usage
        System.out.println("Decorator Pattern:");
        System.out.println("Room Description: " + deluxeRoom.getDescription());
        System.out.println("Room Cost: " + deluxeRoom.getCost());

        System.out.println("\nComposite Pattern:");
        composite.showDetails();

        System.out.println("\nFacade Pattern:");
        bookingFacade.bookRoom();

        System.out.println("\nProxy Pattern:");
        System.out.println("Room Description: " + proxyRoom.getDescription());

        System.out.println("\nBridge Pattern:");
        luxuryRoom.create();

        System.out.println("\nFlyweight Pattern:");
        System.out.println("Flyweight Room Description: " + flyweightRoom.getDescription());
    }
}
