public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;

    private boolean empty;
    private boolean boiled;

    private SingletonSynchronized(){
        empty = true;
        boiled = false;
    }

    public static synchronized SingletonSynchronized getUniqueInstance(){
        if (uniqueInstance == null)
            uniqueInstance = new SingletonSynchronized();
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