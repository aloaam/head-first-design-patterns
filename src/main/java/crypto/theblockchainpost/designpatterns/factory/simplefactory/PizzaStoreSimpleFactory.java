package crypto.theblockchainpost.designpatterns.factory.simplefactory;

import crypto.theblockchainpost.designpatterns.factory.Pizza;

/**
 * In this approach the variables are taking, the factory is
 * injected into the pizza store. So, the delegation of the pizza
 * is moved outside the pizza store.
 */
public class PizzaStoreSimpleFactory {

    SimplePizzaFactory factory;

    public PizzaStoreSimpleFactory(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = SimplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
