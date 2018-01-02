package entity;

import inter.imple.FlyNoWay;
import inter.imple.Squack;

/**
 * @author johnzhu
 */
public class ModelDuck extends Duck {
    public ModelDuck (){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }

    @Override
    public void display() {
        System.out.println("i m a model duck");
    }
}
