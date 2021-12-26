package strategy;

import java.util.Arrays;
import java.util.List;

public class SimUDuck {
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck());

        for(Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
        }
    }
}
