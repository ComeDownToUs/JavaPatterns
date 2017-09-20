public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza(){
        name = "Chicago deep dish cheese";
        dough = "Thick crust";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting into square slices");
    }
}