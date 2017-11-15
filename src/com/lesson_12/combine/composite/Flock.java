package com.lesson_12.combine.composite;

import com.lesson_12.combine.duck.Quackable;
import com.lesson_12.combine.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker :
                quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker :
                quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}
}
