package org.edu.ducks;

import org.edu.behaviors.fly.FlyWithWings;
import org.edu.behaviors.quack.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Rubber duck here!");
    }
}
