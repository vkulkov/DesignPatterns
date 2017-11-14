package com.lesson_9.javaiterator.menu;

import com.lesson_9.javaiterator.MenuItem;

import java.util.Iterator;

public abstract class Menu {
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Iterator<MenuItem> createIterator();
}
