package abstractFactory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Pepperoni pepperoni;
    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println("Bake");
    }

    void cut() {
        System.out.println("Cut");
    }

    void box() {
        System.out.println("Box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
