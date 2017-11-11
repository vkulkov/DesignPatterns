package com.lesson_4.fabricmethod.pizza.chicago;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        super("Chicago Style Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Chicago Cheese pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Cheese pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago Cheese pizza boxed");
    }
}
