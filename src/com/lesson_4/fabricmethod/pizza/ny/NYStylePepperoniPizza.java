package com.lesson_4.fabricmethod.pizza.ny;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        super("New York Style Pepperoni Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("New York Pepperoni pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("New York Pepperoni pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("New York Pepperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("New York Pepperoni pizza boxed");
    }
}
