package factory;

public class NYStyleCheesePizza extends Pizza {
    NYStyleCheesePizza() {
        this.name = "NY Style Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        this.toppings.add("Grated Reggiano Cheese");
    }
}
