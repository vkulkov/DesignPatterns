package com.lesson_3.starbuzz.condiment;

import com.lesson_3.starbuzz.drinks.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }
}
