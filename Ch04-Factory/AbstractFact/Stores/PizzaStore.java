package Stores;


import IngredientFactories.PizzaIngredientFactory;
import Pizzas.CheesePizza;
import Pizzas.Pizza;
import Pizzas.VeggiePizza;

public abstract class PizzaStore{
    PizzaIngredientFactory ingredientFactory;

    public abstract Pizza orderPizza(String item);

    protected Pizza createPizza(String item){
        Pizza pizza = null;

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
        }
        else if(item.equals("veggies")){
            pizza = new VeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}