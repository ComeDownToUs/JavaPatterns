package Stores;

import Pizzas.Pizza;

import IngredientFactories.ChicagoIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(){
        this.ingredientFactory = new ChicagoIngredientFactory();
    }

    public Pizza orderPizza(String item){
        return createPizza(item);
    }
}