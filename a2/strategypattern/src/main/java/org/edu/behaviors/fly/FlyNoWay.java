package org.edu.behaviors.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly but I sincerely wish I could");
    }
}
