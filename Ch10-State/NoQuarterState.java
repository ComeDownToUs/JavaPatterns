public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("Inserted Quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    public void ejectQuarter() {
        System.out.println("No Quarter");
    }
    public void turnCrank() {
        System.out.println("Crank turned, but no quarter");
    }
    public void dispense() {
        System.out.println("Pay up first");
    }

    public String toString(){
        return "No Quarter";
    }
}