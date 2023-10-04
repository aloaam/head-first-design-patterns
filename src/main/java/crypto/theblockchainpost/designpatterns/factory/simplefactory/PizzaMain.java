package crypto.theblockchainpost.designpatterns.factory.simplefactory;

import static crypto.theblockchainpost.designpatterns.factory.simplefactory.PizzaType.*;

public class PizzaMain {

    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStoreSimpleFactory pizzaStoreSimpleFactory = new PizzaStoreSimpleFactory(factory);
        pizzaStoreSimpleFactory.orderPizza(PEPPERONI);
    }

}
