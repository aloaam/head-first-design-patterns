package crypto.theblockchainpost.designpatterns.singleton;

/**
 * "Naive" implementation of the singleton pattern.
 */
public class NaiveSingletonPattern {

    private static NaiveSingletonPattern uniqueInstance;

    protected NaiveSingletonPattern() {
    }

    public static NaiveSingletonPattern getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new NaiveSingletonPattern();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a naive-singleton implementation";
    }

}
