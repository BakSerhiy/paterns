package behavioral.memento;

import java.util.List;

public class CartMemento {
    private final List<String> items;

    public CartMemento(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}