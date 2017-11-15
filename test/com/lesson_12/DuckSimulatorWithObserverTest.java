package com.lesson_12;

import com.lesson_12.combine.adapter.Goose;
import com.lesson_12.combine.adapter.GooseAdapter;
import com.lesson_12.combine.composite.Flock;
import com.lesson_12.combine.decorator.QuackCounter;
import com.lesson_12.combine.duck.Quackable;
import com.lesson_12.combine.factory.AbstractDuckFactory;
import com.lesson_12.combine.factory.CountingDuckFactory;
import com.lesson_12.combine.observer.Quackologist;

public class DuckSimulatorWithObserverTest {
    public static void main(String[] args) {
        new DuckSimulatorWithObserverTest().simulate(new CountingDuckFactory());
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        System.out.println("Duck Simulator: With Observer\n");

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
