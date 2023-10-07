package crypto.theblockchainpost.designpatterns.factory.simplefactory;

import crypto.theblockchainpost.designpatterns.factory.FactoryRuntimeException;
import crypto.theblockchainpost.designpatterns.factory.Pizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimplePizzaFactory {

    public static Pizza createPizza(PizzaType pizzaType) {

        log.info("Creating pizza of type: {}", pizzaType.name());
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
