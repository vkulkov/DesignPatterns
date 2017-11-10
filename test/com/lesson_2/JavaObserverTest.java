package com.lesson_2;

import com.lesson_2.weatherobservable.WeatherData;
import com.lesson_2.weatherobservable.observer.CurrentConditionsDisplay;
import com.lesson_2.weatherobservable.observer.ForecastDisplay;
import com.lesson_2.weatherobservable.observer.HeatIndexDisplay;
import com.lesson_2.weatherobservable.observer.StatisticsDisplay;

public class JavaObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);
        HeatIndexDisplay hid = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(25, 40, 7);
        weatherData.setMeasurements(35, 30, 5);
        weatherData.setMeasurements(20, 50, 5);
    }
}
