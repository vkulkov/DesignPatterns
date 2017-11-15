package com.lesson_12;

import com.lesson_12.combine.duck.*;

public class DuckSimulatorTest {
    public static void main(String[] args) {
        new DuckSimulatorTest().simulate();
    }

    private void simulate() {
        System.out.println("Duck Simulator\n");

        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
