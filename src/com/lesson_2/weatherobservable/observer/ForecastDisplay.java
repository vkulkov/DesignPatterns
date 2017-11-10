package com.lesson_2.weatherobservable.observer;

import com.lesson_2.weather.DisplayElement;
import com.lesson_2.weatherobservable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
