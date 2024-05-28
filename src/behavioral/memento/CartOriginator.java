package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CartOriginator {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public CartMemento save() {
        return new CartMemento(new ArrayList<>(items));
    }

    public void restore(CartMemento memento) {
        items = memento.getItems();
    }

    public void showItems() {
        System.out.println("Cart items: " + items);
    }
}