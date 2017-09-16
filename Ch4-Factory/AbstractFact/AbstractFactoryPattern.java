import Pizzas.Pizza;
import Stores.ChicagoPizzaStore;
import Stores.NYPizzaStore;
import Stores.PizzaStore;

public class AbstractFactoryPattern {
    public static void main(String[] args){
        PizzaStore store = new NYPizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.toString());
        pizza = store.orderPizza("veggies");
        System.out.println(pizza.toString());

        store = new ChicagoPizzaStore();
        pizza = store.orderPizza("cheese");
        System.out.println(pizza.toString());
        pizza = store.orderPizza("veggies");
        System.out.println(pizza.toString());
    }
}