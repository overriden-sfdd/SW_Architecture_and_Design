package org.edu.ducks;

import org.edu.behaviors.fly.FlyWithWings;
import org.edu.behaviors.quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Red head duck here!");
    }
}
