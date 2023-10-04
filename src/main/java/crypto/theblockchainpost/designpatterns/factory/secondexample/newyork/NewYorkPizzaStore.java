package crypto.theblockchainpost.designpatterns.factory.secondexample.newyork;

import crypto.theblockchainpost.designpatterns.factory.FactoryRuntimeException;
import crypto.theblockchainpost.designpatterns.factory.Pizza;
import crypto.theblockchainpost.designpatterns.factory.secondexample.PizzaStore;
import crypto.theblockchainpost.designpatterns.factory.simplefactory.PizzaType;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE -> {
                return new NewYorkCheesePizza();
            }
            case PEPPERONI -> {
                return new NewYorkPepperoniPizza();
            }
            case CLAM -> {
                return new NewYorkClamPizza();
            }
            case VEGGIE -> {
                return new NewYorkVeggiePizza();
            }
        }
        throw new FactoryRuntimeException(
                String.format("The pizza value type passed doesn't exist (it is probably null). " +
                        "Value passed :%s", pizzaType));
    }
}
