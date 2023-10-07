package crypto.theblockchainpost.designpatterns.singleton;

/**
 * The double-checked locking instance, reduces the overhead, while
 * is still thread safe.
 */
public class DoubleCheckedLockingSingletonPattern {

    private volatile static DoubleCheckedLockingSingletonPattern uniqueInstance;

    protected DoubleCheckedLockingSingletonPattern() {}

    public static DoubleCheckedLockingSingletonPattern getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLockingSingletonPattern.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingletonPattern();
                }
            }

        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a double-checked-locking-singleton implementation";
    }

}
