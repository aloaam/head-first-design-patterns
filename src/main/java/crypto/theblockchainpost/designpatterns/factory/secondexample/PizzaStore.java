package crypto.theblockchainpost.designpatterns.factory.secondexample;

import crypto.theblockchainpost.designpatterns.factory.Pizza;
import crypto.theblockchainpost.designpatterns.factory.simplefactory.PizzaType;

/**
 * In this approach, instead of forcing the class to use the pizza factory,
 * we are letting it implement their solution.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);

}
