package com.lesson_1;

import com.lesson_1.behavior.fly.FlyRocketPowered;
import com.lesson_1.duck.*;

public class DuckTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck modelDuck = new ModelDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
