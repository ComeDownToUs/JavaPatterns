public class CompositePattern {
    public static void main(String[] args){
        MenuComponent dinerMenu = new DinerMenu("Diner Menu", "Lunch");
        MenuComponent pancakeMenu = new PancakeMenu("Pancake Menu", "Breakfast");
        MenuComponent dessertMenu = new DessertMenu("Dessert Menu", "Dessert");//to be a sub menu of dinerMenu

        MenuComponent allMenus = new Menu("All Menus", "The full menu");

        allMenus.add(dinerMenu);
        allMenus.add(pancakeMenu);
        dinerMenu.add(dessertMenu);

        dinerMenu.add(new MenuItem("Veg BLT", "yep, food", true, 1.99));
        dinerMenu.add(new MenuItem("BLT", "yep, food", false, 1.99));
        dinerMenu.add(new MenuItem("Salad", "yep, green food", true, 2.99));
        dinerMenu.add(new MenuItem("A Car", "some potatoes", true, 3.99));
        dinerMenu.add(new MenuItem("Meaty Salad", "yep, food", false, 1.99));
        dinerMenu.add(new MenuItem("Falafel", "yep, green food", true, 2.99));
    }
}