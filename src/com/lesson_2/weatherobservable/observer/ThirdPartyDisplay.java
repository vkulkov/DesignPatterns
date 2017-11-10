package com.lesson_2.weatherobservable.observer;

import com.lesson_2.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void display() {
        System.out.println("Some Data");
    }


    @Override
    public void update(Observable o, Object arg) {
        display();
    }
}
