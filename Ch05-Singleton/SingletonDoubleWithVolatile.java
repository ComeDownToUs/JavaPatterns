public class SingletonDoubleWithVolatile {
    private volatile static SingletonDoubleWithVolatile uniqueInstance;

    private boolean empty;
    private boolean boiled;

    private SingletonDoubleWithVolatile(){
        empty = true;
        boiled = false;
    }

    public static SingletonDoubleWithVolatile getUniqueInstance(){
        if (uniqueInstance == null){
            synchronized (SingletonDoubleWithVolatile.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonDoubleWithVolatile();
                }
            }
        }

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