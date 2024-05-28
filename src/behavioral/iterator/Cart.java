package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public Iterator<T> iterator() {
        return new CartIterator<>(items);
    }
}