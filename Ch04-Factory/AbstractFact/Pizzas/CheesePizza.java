package Pizzas;

import Ingredients.Veggies;

import IngredientFactories.*;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.name = "Pizzas.CheesePizza";
        this.veggies = new Veggies[]{};
    }

    void prepare(){

    }
}