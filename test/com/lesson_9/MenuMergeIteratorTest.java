package com.lesson_9;

import com.lesson_9.javaiterator.Waitress;
import com.lesson_9.javaiterator.menu.CafeMenu;
import com.lesson_9.javaiterator.menu.DinerMenu;
import com.lesson_9.javaiterator.menu.Menu;
import com.lesson_9.javaiterator.menu.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuMergeIteratorTest {
    public static void main(String[] args) {
        List<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu("BREAKFAST"));
        menus.add(new DinerMenu("LUNCH"));
        menus.add(new CafeMenu("DINNER"));

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
