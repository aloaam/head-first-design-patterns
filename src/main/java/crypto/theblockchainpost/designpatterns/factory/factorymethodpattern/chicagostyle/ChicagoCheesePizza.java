package crypto.theblockchainpost.designpatterns.factory.factorymethodpattern.chicagostyle;

import crypto.theblockchainpost.designpatterns.factory.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        this.setPizzaName("Chicago Style, thin and... I'm not really sure");
        this.setDough("This Crust thin");
        this.setSauce("Chicago Bears Sauce");
    }
}
