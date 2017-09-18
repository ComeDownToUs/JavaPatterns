public class FactoryMethodPattern{
    public static void main(String[] args){
        PizzaStore ny = new NYStylePizzaStore();
        PizzaStore chi = new ChicagoStylePizzaStore();

        Pizza pizza = ny.orderPizza("cheese");
        System.out.println("I ordered a "+ pizza.getName()+"\n");

        pizza = ny.orderPizza("veggie");
        System.out.println("THen I ordered a "+pizza.getName()+"\n");

        pizza = chi.orderPizza("cheese");
        System.out.println("Finally I went away and got: "+pizza.getName()+"\n");
    }
}