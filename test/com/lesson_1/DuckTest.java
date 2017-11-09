package com.lesson_1;

import com.lesson_1.duck.DecoyDuck;
import com.lesson_1.duck.Duck;
import com.lesson_1.duck.MallardDuck;
import com.lesson_1.duck.RubberDuck;

public class DuckTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
