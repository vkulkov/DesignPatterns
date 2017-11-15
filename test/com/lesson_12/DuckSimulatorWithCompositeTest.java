package com.lesson_12;

import com.lesson_12.combine.adapter.Goose;
import com.lesson_12.combine.adapter.GooseAdapter;
import com.lesson_12.combine.composite.Flock;
import com.lesson_12.combine.decorator.QuackCounter;
import com.lesson_12.combine.duck.Quackable;
import com.lesson_12.combine.factory.AbstractDuckFactory;
import com.lesson_12.combine.factory.CountingDuckFactory;

public class DuckSimulatorWithCompositeTest {
    public static void main(String[] args) {
        new DuckSimulatorWithCompositeTest().simulate(new CountingDuckFactory());
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        System.out.println("Duck Simulator: With Composite - Flocks");

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

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
