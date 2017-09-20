public class IteratorPattern {
    public static void main(String[] args){
        Menu dinnerMenu = new DinnerMenu();
        Menu dinnerMenu1 = new DinnerMenu();//replace this with dessert menu

        Waitress waitress = new Waitress(dinnerMenu, dinnerMenu1);

        waitress.printMenu();
    }
}