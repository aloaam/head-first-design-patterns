package crypto.theblockchainpost.designpatterns.factory.factorymethodpattern;

import crypto.theblockchainpost.designpatterns.factory.factorymethodpattern.chicagostyle.ChicagoPizzaStore;
import crypto.theblockchainpost.designpatterns.factory.factorymethodpattern.newyork.NewYorkPizzaStore;

import static crypto.theblockchainpost.designpatterns.factory.simplefactory.PizzaType.CHEESE;

public class FactoryMethodPattern {

    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        newYorkPizzaStore.orderPizza(CHEESE);
        chicagoPizzaStore.orderPizza(CHEESE);

    }

}
