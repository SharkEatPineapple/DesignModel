package inter.imple;

import inter.QuackBehavior;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("za...za...za");
    }
}
