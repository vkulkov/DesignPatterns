package com.lesson_12.combine.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
