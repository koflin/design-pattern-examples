package factory;

public class NYStylePepperoniPizza extends Pizza {
    NYStylePepperoniPizza() {
        this.name = "NY Style Pepperoni Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        this.toppings.add("Spicy Salami");
    }
}
