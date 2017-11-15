package com.lesson_12.combine.duck;

import com.lesson_12.combine.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
