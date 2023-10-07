package crypto.theblockchainpost.designpatterns.command;

public class SimpleRemoteControl {

    private Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
