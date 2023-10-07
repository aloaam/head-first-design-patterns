package crypto.theblockchainpost.designpatterns.singleton;

/**
 * We could initialize the instance right away to avoid checking
 * if the instance has been created already.
 *
 * If we do this, we need to take care that the object is not resource
 * intensive, or that it is actually used for all processes, otherwise
 * it just creates overhead.
 */
public class NaiveInitializedSingletonPattern {

    private static final NaiveInitializedSingletonPattern uniqueInstance = new NaiveInitializedSingletonPattern();

    protected NaiveInitializedSingletonPattern() {}

    public static NaiveInitializedSingletonPattern getInstance() {
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a naive-initialized-from-the-start-singleton implementation";
    }

}
