package crypto.theblockchainpost.designpatterns.factory;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Pizza {

    private String pizzaName;
    private String dough;
    private String sauce;

    public void prepare() {
        System.out.println("Preparing " + pizzaName + "...");
        System.out.println("Tossing " + dough + "...");
        System.out.println("Adding " + sauce + "...");
    }

    public void bake() {
        System.out.println("Baking for 25 minutes at 350...");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices...");
    }

    public void box() {
        System.out.println("Placing pizza in official PizzaStore box...");
    }

}
