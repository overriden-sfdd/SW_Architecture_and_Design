package org.edu.ducks;

import org.edu.behaviors.fly.FlyNoWay;
import org.edu.behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck here!");
    }
}