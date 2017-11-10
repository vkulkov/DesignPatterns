package com.lesson_2.weatherobservable.observer;

import com.lesson_2.weather.DisplayElement;
import com.lesson_2.weatherobservable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp;
    private float maxTemp;
    private float tempSum;
    private int numReadings;

    public StatisticsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Statistics: Avg Temp = %f; Min Temp = %f; Max Temp = %f%n",
                (tempSum/numReadings), minTemp, maxTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
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
            display();
        }
    }
}
