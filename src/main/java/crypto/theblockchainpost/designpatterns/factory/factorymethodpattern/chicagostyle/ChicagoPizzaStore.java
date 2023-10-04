package crypto.theblockchainpost.designpatterns.factory.factorymethodpattern.chicagostyle;

import crypto.theblockchainpost.designpatterns.factory.FactoryRuntimeException;
import crypto.theblockchainpost.designpatterns.factory.Pizza;
import crypto.theblockchainpost.designpatterns.factory.factorymethodpattern.PizzaStore;
import crypto.theblockchainpost.designpatterns.factory.simplefactory.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE -> {
                return new ChicagoCheesePizza();
            }
            case PEPPERONI -> {
                return new ChicagoPepperoniPizza();
            }
            case CLAM -> {
                return new ChicagoClamPizza();
            }
            case VEGGIE -> {
                return new ChicagoVeggiePizza();
            }
        }
        throw new FactoryRuntimeException(
                String.format("The pizza value type passed doesn't exist (it is probably null). " +
                        "Value passed :%s", pizzaType));
    }
}
