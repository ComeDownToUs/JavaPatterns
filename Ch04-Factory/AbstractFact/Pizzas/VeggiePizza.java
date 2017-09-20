package Pizzas;

import IngredientFactories.*;

public class VeggiePizza extends Pizza {

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.name = "Pizzas.VeggiePizza";
        this.veggies = ingredientFactory.createVeggies();
    }

    void prepare(){
        System.out.println(this.toString());
    }
}