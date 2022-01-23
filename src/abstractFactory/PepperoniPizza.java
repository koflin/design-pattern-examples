package abstractFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        dough = this.ingredientFactory.createDough();
        sauce = this.ingredientFactory.createSauce();
        cheese = this.ingredientFactory.createCheese();
    }
}
