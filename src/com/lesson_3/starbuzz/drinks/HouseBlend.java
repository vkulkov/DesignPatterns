package com.lesson_3.starbuzz.drinks;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 20;
    }
}
