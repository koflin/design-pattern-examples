package strategy;

public class MallardDuck extends Duck {
    protected MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("Looks like a mallard");
    }
}
