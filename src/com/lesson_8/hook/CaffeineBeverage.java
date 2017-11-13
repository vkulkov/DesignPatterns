package com.lesson_8.hook;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (consumerWantsCondiments()) {
            addCondiments();
        }
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiments();

    protected boolean consumerWantsCondiments() {
        return true;
    }
}
