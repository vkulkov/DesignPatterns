package com.lesson_2.weather.observer;

import com.lesson_2.weather.DisplayElement;
import com.lesson_2.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: Temperature = %f; Humidity = %f%n",
                temp, humidity);
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
    }
}
