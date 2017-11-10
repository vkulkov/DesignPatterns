package com.lesson_2.weather.observer;

import com.lesson_2.weather.DisplayElement;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void display() {
        System.out.println("Some Data");
    }

    @Override
    public void update() {
    }
}
