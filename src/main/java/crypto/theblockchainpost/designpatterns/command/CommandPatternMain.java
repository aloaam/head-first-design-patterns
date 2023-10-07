package crypto.theblockchainpost.designpatterns.command;

public class CommandPatternMain {

    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();

        LightOnCommand lightOnCommand = new LightOnCommand(new Light());

        remote.setSlot(lightOnCommand);
        remote.buttonWasPressed();


    }

}
