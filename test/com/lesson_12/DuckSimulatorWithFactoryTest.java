package com.lesson_12;

import com.lesson_12.combine.adapter.Goose;
import com.lesson_12.combine.adapter.GooseAdapter;
import com.lesson_12.combine.decorator.QuackCounter;
import com.lesson_12.combine.duck.Quackable;
import com.lesson_12.combine.factory.AbstractDuckFactory;
import com.lesson_12.combine.factory.CountingDuckFactory;

public class DuckSimulatorWithFactoryTest {
    public static void main(String[] args) {
        new DuckSimulatorWithFactoryTest().simulate(new CountingDuckFactory());
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        System.out.println("Duck Simulator: With Abstract Factory\n");

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
