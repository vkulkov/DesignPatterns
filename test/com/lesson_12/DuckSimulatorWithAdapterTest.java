package com.lesson_12;

import com.lesson_12.combine.adapter.Goose;
import com.lesson_12.combine.adapter.GooseAdapter;
import com.lesson_12.combine.duck.*;

public class DuckSimulatorWithAdapterTest {
    public static void main(String[] args) {
        new DuckSimulatorWithAdapterTest().simulate();
    }

    private void simulate() {
        System.out.println("Duck Simulator: With Adapter\n");

        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
