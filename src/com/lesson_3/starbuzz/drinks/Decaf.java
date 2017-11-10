package com.lesson_3.starbuzz.drinks;

public class Decaf extends Beverage {
    public Decaf() {
        super("Decaf Coffee");
    }

    @Override
    public double cost() {
        return 17;
    }
}
