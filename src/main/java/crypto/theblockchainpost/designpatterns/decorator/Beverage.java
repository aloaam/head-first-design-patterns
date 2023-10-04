package crypto.theblockchainpost.designpatterns.decorator;

public abstract class Beverage {

    String description = "Unknown beverage";

    public abstract double cost();
    public String getDescription() {
        return description;
    }


}
