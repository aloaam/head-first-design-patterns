package crypto.theblockchainpost.designpatterns.factory;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Setter
@Getter
@Slf4j
public abstract class Pizza {

    private String pizzaName;
    private String dough;
    private String sauce;

    public void prepare() {
        log.info("Preparing {}...", pizzaName);
        log.info("Tossing {}...", dough);
        log.info("Adding {}...", sauce);
    }

    public void bake() {
        log.info("Baking for 25 minutes at 350...");
    }

    public void cut() {
        log.info("Cutting the pizza into diagonal slices...");
    }

    public void box() {
        log.info("Placing pizza in official PizzaStore box...");
    }




}
