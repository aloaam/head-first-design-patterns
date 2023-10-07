package crypto.theblockchainpost.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorMain {


    //TODO - Alo: i wasnt able to get the descriptin working properly. Run the code and see.
    public static void main(String[] args) {

        // Simple drink
        Beverage drink1 = new Espresso();
        printBeverageCost(drink1);


        //Drink with two mochas and a whip
        Beverage drink2 = new DarkRoast();
        drink2 = new Mocha(drink2);
        drink2 = new Mocha(drink2);
        drink2 = new Whip(drink2);
        printBeverageCost(drink2);

        //Drink with two soy, mocha and milk
        Beverage drink3 = new HouseBlend();
        drink3 = new Soy(drink3);
        drink3 = new Mocha(drink3);
        drink3 = new Whip(drink3);
        printBeverageCost(drink3);
    }


    private static void printBeverageCost(Beverage beverage) {
        log.info(beverage.description + ": $ " + beverage.cost());
    }

}
