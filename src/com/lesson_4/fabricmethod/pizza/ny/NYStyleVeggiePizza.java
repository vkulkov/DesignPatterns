package com.lesson_4.fabricmethod.pizza.ny;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        super("New York Style Veggie Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("New York Veggie pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("New York Veggie pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("New York Veggie pizza cut");
    }

    @Override
    public void box() {
        System.out.println("New York Veggie pizza boxed");
    }
}
