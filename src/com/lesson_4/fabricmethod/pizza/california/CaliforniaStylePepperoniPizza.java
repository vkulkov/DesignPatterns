package com.lesson_4.fabricmethod.pizza.california;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        super("California Style Pepperoni Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Californian Pepperoni pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Californian Pepperoni pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Californian Pepperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Californian Pepperoni pizza boxed");
    }
}
