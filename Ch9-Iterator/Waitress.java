public class Waitress {
    Menu menu;
    Menu menu2;

    public Waitress(Menu menu, Menu menu2){
        this.menu = menu;
        this.menu2 = menu2;
    }

    public void printMenu(){
        Iterator iterator = menu.createIterator();
        Iterator iterator2 = menu2.createIterator();
        System.out.println("Menu for dinner");
        printMenu(iterator);
        System.out.println("Menu for dinner2");
        printMenu(iterator2);
    }
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName()+" | ");
            System.out.print(menuItem.getDescription()+" | ");
            System.out.println(menuItem.getPrice());
        }
    }
}