package crypto.theblockchainpost.designpatterns.factory.simplefactory;

import crypto.theblockchainpost.designpatterns.factory.FactoryRuntimeException;
import crypto.theblockchainpost.designpatterns.factory.Pizza;

public class SimplePizzaFactory {

    public static Pizza createPizza(PizzaType pizzaType) {

        System.out.println(String.format("Creating pizza of type: %s", pizzaType.name()));
        switch (pizzaType) {
            case CHEESE -> {
                return new CheesePizza();
            }
            case PEPPERONI -> {
                return new PepperoniPizza();
            }
            case CLAM -> {
                return new ClamPizza();
            }
            case VEGGIE -> {
                return new VeggiePizza();
            }
        }
        throw new FactoryRuntimeException(
                String.format("The pizza value type passed doesn't exist (it is probably null). " +
                              "Value passed :%s", pizzaType));
    }

}
