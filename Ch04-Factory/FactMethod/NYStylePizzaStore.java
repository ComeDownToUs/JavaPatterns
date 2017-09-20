class NYStylePizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if(item.equals("cheese"))
            return new NYCheesePizza();
        else if(item.equals("veggie"))
            return new NYVeggiePizza();
        else
            return null;
    }
}