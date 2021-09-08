package org.edu.behaviors.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Default quack");
    }
}
