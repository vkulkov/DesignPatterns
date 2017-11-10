package com.lesson_3.starbuzz.condiment;

import com.lesson_3.starbuzz.drinks.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with soy";
    }
}
