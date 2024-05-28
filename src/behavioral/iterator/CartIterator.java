package behavioral.iterator;

import java.util.List;

public class CartIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;

    public CartIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        return items.get(position++);
    }
}