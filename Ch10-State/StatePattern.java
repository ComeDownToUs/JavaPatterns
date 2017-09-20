public class StatePattern {
    public static void main(String[] args){
        int numberOfBalls = 3;
        GumballMachine gumballMachine = new GumballMachine(numberOfBalls);
        for(int i=0; i < numberOfBalls+1; i++){
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }
}