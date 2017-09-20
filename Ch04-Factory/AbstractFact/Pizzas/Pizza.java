package Pizzas;

import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.Sauce;
import Ingredients.Veggies;

import IngredientFactories.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;

    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String vegs = "";
        for(Veggies v:veggies)
            vegs += (", "+v.toString());

        return dough.toString() + "|" + sauce.toString() + "|" + cheese.toString() + vegs;
    }
}