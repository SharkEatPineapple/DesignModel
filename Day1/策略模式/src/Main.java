import entity.Duck;
import entity.ModelDuck;
import inter.imple.FlyWithWings;

public class Main {

    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        duck.performQuack();
    }
}
