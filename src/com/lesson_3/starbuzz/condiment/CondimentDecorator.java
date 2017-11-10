package com.lesson_3.starbuzz.condiment;

import com.lesson_3.starbuzz.drinks.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public CondimentDecorator() {
        super(null);
    }

    public abstract String getDescription();
}
