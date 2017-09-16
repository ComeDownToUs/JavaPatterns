package IngredientFactories;

import Ingredients.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Sauce createSauce() {
        return new KetchupSauce();
    }
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new Garlic(), new Onion()};
        return  veggies;
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Clams createClam() {
        return new FrozenClam();
    }
}