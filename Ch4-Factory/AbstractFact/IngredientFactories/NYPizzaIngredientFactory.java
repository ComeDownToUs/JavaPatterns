package IngredientFactories;

import Ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new Garlic(), new Mushrooms()};
        return  veggies;
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Clams createClam() {
        return new FreshClam();
    }
}