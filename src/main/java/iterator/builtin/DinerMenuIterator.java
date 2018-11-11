package iterator.builtin;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    String [] items;
    int position = 0;

    public DinerMenuIterator(String[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public String next() {
        String menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position-1] != null) {
            for (int i = position - 1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
