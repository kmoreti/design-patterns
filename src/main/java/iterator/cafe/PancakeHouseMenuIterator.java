package iterator.cafe;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> menuItems) {
        this.items = menuItems;
    }

    @Override
    public String next() {
        String menuItem = items.get(position);
        position ++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

}
