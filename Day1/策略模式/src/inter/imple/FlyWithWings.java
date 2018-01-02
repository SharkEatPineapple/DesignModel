package inter.imple;

import inter.FlyBehavior;

/**
 * @author johnzhu
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
