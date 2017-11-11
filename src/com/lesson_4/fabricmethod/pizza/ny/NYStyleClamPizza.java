package com.lesson_4.fabricmethod.pizza.ny;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        super("New York Style Clam Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("New York Clam pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("New York Clam pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("New York Clam pizza cut");
    }

    @Override
    public void box() {
        System.out.println("New York Clam pizza boxed");
    }
}
