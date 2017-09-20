public class AdapterPattern {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


        System.out.println("\nThe turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe turkey pretending to be a duck says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}