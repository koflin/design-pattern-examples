package strategy;

public class DecoyDuck extends Duck {

    DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("Looks like a decoy duck");
    }
}
