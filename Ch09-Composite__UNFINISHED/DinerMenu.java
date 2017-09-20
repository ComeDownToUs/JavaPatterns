public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Veg BLT", "yep, food", true, 1.99);
        addItem("BLT", "yep, food", false, 1.99);
        addItem("Salad", "yep, green food", true, 2.99);
        addItem("A Car", "some potatoes", true, 3.99);
        addItem("Meaty Salad", "yep, food", false, 1.99);
        addItem("Falafel", "yep, green food", true, 2.99);
    }
    //additem
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("system is full...");
        }
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }


    //dont include getMenuItems
    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }

    //other methods
}