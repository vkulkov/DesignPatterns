package com.lesson_8.starbuzz;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiments();
}
