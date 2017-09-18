import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce");
        System.out.print("Adding Toppings: ");
        for(String s:toppings)
            System.out.print(" " + s);
    }

    void bake(){
        System.out.println("Bake for x minutes");
    }
    void cut(){
        System.out.println("Cutting diagonally");
    }
    void box(){
        System.out.println("Place pizza in official box");
    }
    public String getName(){
        return name;
    }
}