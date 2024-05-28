package structural.composites;

import java.util.ArrayList;
import java.util.List;

public class RoomComposite implements HotelComponent {
    private List<HotelComponent> components = new ArrayList<>();

    public void addComponent(HotelComponent component) {
        components.add(component);
    }

    public void removeComponent(HotelComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        for (HotelComponent component : components) {
            component.showDetails();
        }
    }
}