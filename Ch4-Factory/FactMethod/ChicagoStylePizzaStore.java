class ChicagoStylePizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if(item.equals("cheese"))
            return new ChicagoCheesePizza();
        else if(item.equals("veggie"))
            return new ChicagoVeggiePizza();
        else
            return null;
    }
}