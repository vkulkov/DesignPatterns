package com.lesson_12.combine.duck;

import com.lesson_12.combine.observer.Observable;
import com.lesson_12.combine.observer.Observer;

public class RedheadDuck implements Quackable {
    private Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Redhead Duck";
    }
}
