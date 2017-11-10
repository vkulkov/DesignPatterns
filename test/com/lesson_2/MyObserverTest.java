package com.lesson_2;

import com.lesson_2.weather.observer.CurrentConditionsDisplay;
import com.lesson_2.weather.observer.ForecastDisplay;
import com.lesson_2.weather.observer.HeatIndexDisplay;
import com.lesson_2.weather.observer.StatisticsDisplay;
import com.lesson_2.weather.WeatherData;

public class MyObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);
        HeatIndexDisplay hid = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(25, 40, 7);
        ccd.display();
        sd.display();
        fd.display();
        hid.display();
        weatherData.setMeasurements(35, 30, 5);
        ccd.display();
        sd.display();
        fd.display();
        hid.display();
        weatherData.setMeasurements(20, 50, 5);
        ccd.display();
        sd.display();
        fd.display();
        hid.display();

    }
}
