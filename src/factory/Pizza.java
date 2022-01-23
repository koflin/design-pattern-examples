package factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepare");
    }

    void bake() {
        System.out.println("Bake");
    }

    void cut() {
        System.out.println("Cut");
    }

    void box() {
        System.out.println("Box");
    }

    public String getName() {
        return name;
    }
}
