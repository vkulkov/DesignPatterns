package com.lesson_4.fabricmethod.pizza.california;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        super("California Style Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Californian Cheese pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Californian Cheese pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Californian Cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Californian Cheese pizza boxed");
    }
}
