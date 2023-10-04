package crypto.theblockchainpost.designpatterns.decorator;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

}
