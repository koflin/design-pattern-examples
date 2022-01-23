package factory;

public class ChicagoStyleCheesePizza extends Pizza {
    ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        this.toppings.add("Shredded Mozzarella Cheese");
    }
}
