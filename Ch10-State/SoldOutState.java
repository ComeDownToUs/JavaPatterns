public class SoldOutState implements State {
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        soldOutMessage();
    }
    public void ejectQuarter() {
        soldOutMessage();
    }
    public void turnCrank() {
        soldOutMessage();
    }
    public void dispense() {
        soldOutMessage();
    }

    public void soldOutMessage(){
        System.out.println("Can't do action, machine is sold out");
    }
    public String toString(){
        return "Sold Out";
    }
}