package crypto.theblockchainpost.designpatterns.factory.secondexample;

import crypto.theblockchainpost.designpatterns.factory.secondexample.chicagostyle.ChicagoPizzaStore;
import crypto.theblockchainpost.designpatterns.factory.secondexample.newyork.NewYorkPizzaStore;

import static crypto.theblockchainpost.designpatterns.factory.simplefactory.PizzaType.CHEESE;

public class FactoryDesign {

    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        newYorkPizzaStore.orderPizza(CHEESE);
        chicagoPizzaStore.orderPizza(CHEESE);

    }

}
