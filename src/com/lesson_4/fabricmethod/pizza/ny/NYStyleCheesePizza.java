package com.lesson_4.fabricmethod.pizza.ny;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        super("New York Style Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("New York Cheese pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("New York Cheese pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("New York Cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("New York Cheese pizza boxed");
    }
}
