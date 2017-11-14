package com.lesson_9.merge.iterator;

import com.lesson_9.merge.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
