package abstractFactory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
}
