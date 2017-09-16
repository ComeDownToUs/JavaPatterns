package Stores;
import IngredientFactories.NYPizzaIngredientFactory;
import Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(){
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    public Pizza orderPizza(String item){
        return createPizza(item);
    }
}