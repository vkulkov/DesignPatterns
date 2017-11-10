package com.lesson_3.starbuzz.drinks;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return 25;
    }
}
