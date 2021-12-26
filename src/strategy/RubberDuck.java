package strategy;

public class RubberDuck extends Duck {

    RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    void display() {
        System.out.println("Looks like a rubber duck");
    }
}
