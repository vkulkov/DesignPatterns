package com.lesson_2.weatherobservable.observer;

import com.lesson_2.weather.DisplayElement;
import com.lesson_2.weatherobservable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;

    public CurrentConditionsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: Temperature = %f; Humidity = %f%n",
                temp, humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temp = weatherData.getTemp();
            humidity = weatherData.getHumidity();
            display();
        }
    }
}
