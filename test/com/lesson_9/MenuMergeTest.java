package com.lesson_9;

import com.lesson_9.merge.Waitress;
import com.lesson_9.merge.menu.DinerMenu;
import com.lesson_9.merge.menu.PancakeHouseMenu;

public class MenuMergeTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
