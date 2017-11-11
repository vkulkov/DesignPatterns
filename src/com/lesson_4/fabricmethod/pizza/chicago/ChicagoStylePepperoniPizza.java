package com.lesson_4.fabricmethod.pizza.chicago;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        super("Chicago Style Pepperoni Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Chicago Pepperoni pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Pepperoni pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Pepperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago Pepperoni pizza boxed");
    }
}
