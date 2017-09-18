public class SimpleRemoteControl {
    Command[] slots = new Command[2];

    public SimpleRemoteControl(){ }

    public void setCommand(Command command, int index){
        slots[index] = command;
    }

    public void buttonWasPressed(int index){
        slots[index].execute();
    }
}