package structural.facades;

import structural.adapters.ExternalPaymentSystem;
import structural.decorators.Room;

public class BookingFacade {
    private Room room;
    private ExternalPaymentSystem paymentSystem;

    public BookingFacade(Room room, ExternalPaymentSystem paymentSystem) {
        this.room = room;
        this.paymentSystem = paymentSystem;
    }

    public void bookRoom() {
        System.out.println("Booking room: " + room.getDescription());
        paymentSystem.processPayment(room.getCost());
    }
}