package com.lesson_3.starbuzz.condiment;

import com.lesson_3.starbuzz.drinks.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 3 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with whip";
    }
}
