package com.lesson_12;

import com.lesson_12.combine.adapter.Goose;
import com.lesson_12.combine.adapter.GooseAdapter;
import com.lesson_12.combine.decorator.QuackCounter;
import com.lesson_12.combine.duck.*;

public class DuckSimulatorWithDecoratorTest {
    public static void main(String[] args) {
        new DuckSimulatorWithDecoratorTest().simulate();
    }

    private void simulate() {
        System.out.println("Duck Simulator: With Decorator\n");

        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
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
