package DuckTypes;

import FlyBehaviors.FlyNoWay;
import QuackBehaviors.MuteQuack;

public class WoodenDuck extends Duck {
    public WoodenDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("I am a wooden duck, I can't fly or quack.");
    }
}
