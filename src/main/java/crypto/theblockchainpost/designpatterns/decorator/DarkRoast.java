package crypto.theblockchainpost.designpatterns.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return 0.99;
    }
}
