package abstractFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        dough = this.ingredientFactory.createDough();
        sauce = this.ingredientFactory.createSauce();
        cheese = this.ingredientFactory.createCheese();
    }
}
