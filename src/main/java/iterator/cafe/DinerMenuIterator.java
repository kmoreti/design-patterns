package iterator.cafe;

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
}
