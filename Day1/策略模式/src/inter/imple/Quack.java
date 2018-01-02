package inter.imple;

import inter.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("ga..ga..ga..");
    }
}
