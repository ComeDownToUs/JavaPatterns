public class TemplateMethodPattern {
    public static void main(String[] args){
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("\nCoffee Prep");
        coffee.prepareRecipe();
        System.out.println("\nTea Prep");
        tea.prepareRecipe();
    }
}