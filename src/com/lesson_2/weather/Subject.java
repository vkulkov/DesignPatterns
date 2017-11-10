package com.lesson_2.weather;

import com.lesson_2.weather.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
