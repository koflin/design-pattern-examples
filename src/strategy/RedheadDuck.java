package strategy;

public class RedheadDuck extends Duck {

    RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("looks like a redhead");
    }
}
