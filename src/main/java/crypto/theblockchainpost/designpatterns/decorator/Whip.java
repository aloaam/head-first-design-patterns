package crypto.theblockchainpost.designpatterns.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

}
