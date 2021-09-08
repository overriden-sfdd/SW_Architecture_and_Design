package org.edu;

import org.edu.behaviors.fly.FlyRocketPower;
import org.edu.ducks.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Strategy pattern.");

        Duck mallardDuck = new MallardDuck();
        System.out.println("Mallard duck created.");
        printout(mallardDuck);

        Duck redHeadDuck = new RedHeadDuck();
        System.out.println("Red head duck created.");
        printout(redHeadDuck);

        Duck rubberDuck = new RubberDuck();
        System.out.println("Red head duck created.");
        printout(rubberDuck);

        Duck modelDuck = new ModelDuck();
        System.out.println("Red head duck created.");
        printout(modelDuck);
        System.out.println("Model duck printout with fly behavior changed");
        modelDuck.setFlyBehavior(new FlyRocketPower());
        printout(modelDuck);
    }

    private static void printout(Duck duck) {
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }
}
