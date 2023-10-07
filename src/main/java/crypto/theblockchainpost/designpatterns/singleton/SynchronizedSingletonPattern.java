package crypto.theblockchainpost.designpatterns.singleton;

/**
 * Synchronized implementation of the singleton pattern, which takes care
 * that accidentally two instances are created by different threads on the same
 * program.
 */
public class SynchronizedSingletonPattern {

    private static SynchronizedSingletonPattern uniqueInstance;

    // We could initialize the instance right away:

    protected SynchronizedSingletonPattern() {}

    // The synchronized keyword, forces every thread to wait for
    // its turn before entering this method.
    public static synchronized SynchronizedSingletonPattern getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingletonPattern();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a naive-synchronized-singleton implementation";
    }

}
