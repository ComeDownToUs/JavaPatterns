public class ChicagoVeggiePizza extends Pizza{
    public ChicagoVeggiePizza(){
        name = "Chicago deep dish veggie";
        dough = "Thick crust";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Veggie Cheese");
    }

    void cut(){
        System.out.println("Cutting into square slices");
    }
}