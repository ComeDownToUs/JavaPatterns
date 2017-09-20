public class SimpleCommandPattern {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        remote.setCommand(new LightOnCommand(light), 0);
        remote.setCommand(new LightOffCommand(light), 1);

        remote.buttonWasPressed(0);
        remote.buttonWasPressed(1);
    }
}