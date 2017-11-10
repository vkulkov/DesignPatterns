package com.lesson_2.weather.observer;

import com.lesson_2.weather.DisplayElement;
import com.lesson_2.weather.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp;
    private float maxTemp;
    private float tempSum;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Statistics: Avg Temp = %f; Min Temp = %f; Max Temp = %f%n",
                (tempSum/numReadings), minTemp, maxTemp);
    }

    @Override
    public void update() {
        float temp = weatherData.getTemp();
        tempSum += temp;
        numReadings++;

        if (numReadings == 1) {
            minTemp = temp;
            maxTemp = temp;
        } else if (minTemp > temp) {
            minTemp = temp;
        } else if (maxTemp < temp) {
            maxTemp = temp;
        }
    }
}
