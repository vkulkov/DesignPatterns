package com.lesson_4.fabricmethod.pizza;

public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
