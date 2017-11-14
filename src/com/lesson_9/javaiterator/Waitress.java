package com.lesson_9.javaiterator;

import com.lesson_9.javaiterator.menu.Menu;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        System.out.println("MENU\n-----");
        for (Menu menu :
                menus) {
            System.out.println("\n" + menu.getName());
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            System.out.println();
        }
    }
}
