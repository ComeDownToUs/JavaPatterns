public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("A quarter is inserted already");
    }
    public void ejectQuarter() {
        System.out.println("Ejected Quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }
    public void dispense() {
        System.out.println("Dispensed");
    }
    public String toString(){
        return "Has Quarter";
    }
}