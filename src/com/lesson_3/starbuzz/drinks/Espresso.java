package com.lesson_3.starbuzz.drinks;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 15;
    }
}
