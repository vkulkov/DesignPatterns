package com.lesson_4.abstractfactory.pizza;

import com.lesson_4.abstractfactory.ingredient.*;

import java.util.Set;

public abstract class Pizza {
    private String name;
    protected Cheese cheese;
    protected Clams clams;
    protected Dough dough;
    protected Pepperoni pepperoni;
    protected Sauce sauce;
    protected Set<Veggie> veggies;

    public void prepare() {
        System.out.println("Preparing " + name);
    }
    public void bake() {
        System.out.printf("Bake %s for 25 minutes at 350%n", name);
    }
    public void cut() {
        System.out.printf("Cutting the %s into diagonal slices%n", name);
    }
    public void box() {
        System.out.printf("Place %s in the official PizzaStore box%n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
