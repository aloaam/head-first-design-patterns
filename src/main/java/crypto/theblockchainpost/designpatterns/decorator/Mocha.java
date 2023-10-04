package crypto.theblockchainpost.designpatterns.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
