package abstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ShreddedMozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SpicyPepperoni();
    }
}
