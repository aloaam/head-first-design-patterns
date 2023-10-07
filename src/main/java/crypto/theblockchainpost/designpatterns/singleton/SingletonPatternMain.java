package crypto.theblockchainpost.designpatterns.singleton;

public class SingletonPatternMain {

    public static void main(String[] args) {
        String naivImplementation = NaiveSingletonPattern.getInstance().getDescription();
        System.out.println(naivImplementation);

        String naiveInitialized = NaiveInitializedSingletonPattern.getInstance().getDescription();
        System.out.println(naiveInitialized);

        String synchronizedImplementation = SynchronizedSingletonPattern.getInstance().getDescription();
        System.out.println(synchronizedImplementation);

        String doubleCheckedLocked = DoubleCheckedLockingSingletonPattern.getInstance().getDescription();
        System.out.println(doubleCheckedLocked);

        String enumImplementation = EnumSingletonPattern.UNIQUE_INSTANCE.getDescription();
        System.out.println(enumImplementation);

    }

}
