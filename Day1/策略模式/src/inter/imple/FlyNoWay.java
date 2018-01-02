package inter.imple;

import inter.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly no way...");
    }
}
