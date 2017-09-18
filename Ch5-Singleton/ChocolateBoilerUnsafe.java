public class ChocolateBoilerUnsafe {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerUnsafe uniqueInstance;

    private ChocolateBoilerUnsafe(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerUnsafe getUniqueInstance(){
        if (uniqueInstance == null)
            uniqueInstance = new ChocolateBoilerUnsafe();
        return uniqueInstance;
    }

    public void fill(){
        empty = false;
    }
    public void drain(){
        empty = true;
    }
    public void boil(){
        if(!isEmpty() && !isBoiled())
            boiled = true;
    }
    public void isEmpty(){
        return empty;
    }
    public void isBoiled(){
        return boiled;
    }

}