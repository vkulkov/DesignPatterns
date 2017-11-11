package com.lesson_5;

import com.lesson_5.choco.ChocolateBoiler;

public class ChocolateTest {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.showInfo();

        chocolateBoiler.fill();
        chocolateBoiler.showInfo();

        chocolateBoiler.boil();
        chocolateBoiler.showInfo();

        chocolateBoiler.drain();
        chocolateBoiler.showInfo();
    }
}
