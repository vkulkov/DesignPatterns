package com.lesson_8.starbuzz;

public class Coffee extends CaffeineBeverage {

    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
