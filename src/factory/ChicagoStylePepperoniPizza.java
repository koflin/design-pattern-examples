package factory;

public class ChicagoStylePepperoniPizza extends Pizza {
    ChicagoStylePepperoniPizza() {
        this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        this.toppings.add("Pepperoni");
    }

    @Override
    void cut() {
        System.out.println("Cut into squares");
    }
}
