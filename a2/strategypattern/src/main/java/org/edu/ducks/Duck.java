package org.edu.ducks;

import org.edu.behaviors.fly.FlyBehavior;
import org.edu.behaviors.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior _flyBehavior) {
        this.flyBehavior = _flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior _quackBehavior) {
        this.quackBehavior = _quackBehavior;
    }
}
