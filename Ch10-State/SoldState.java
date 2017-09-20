public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("Please wait, new gumball arriving");
    }
    public void ejectQuarter() {
        System.out.println("Too late, crank has been turned");
    }
    public void turnCrank() {
        System.out.println("You can't turn twice");
    }
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        else{
            System.out.println("Outta gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
    public String toString(){
        return "Sold";
    }
}