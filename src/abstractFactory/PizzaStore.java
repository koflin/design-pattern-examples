package abstractFactory;

public abstract class PizzaStore {
    abstract Pizza createPizza(String type);

    void orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
    }
}
