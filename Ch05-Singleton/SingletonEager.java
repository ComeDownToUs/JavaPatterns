public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();

    private boolean empty;
    private boolean boiled;

    private SingletonEager(){
        empty = true;
        boiled = false;
    }

    public static synchronized SingletonEager getUniqueInstance(){
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