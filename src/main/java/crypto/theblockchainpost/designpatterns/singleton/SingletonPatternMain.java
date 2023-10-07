package crypto.theblockchainpost.designpatterns.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonPatternMain {

    public static void main(String[] args) {
        String naiveImplementation = NaiveSingletonPattern.getInstance().getDescription();
        log.info(naiveImplementation);

        String naiveInitialized = NaiveInitializedSingletonPattern.getInstance().getDescription();
        log.info(naiveInitialized);

        String synchronizedImplementation = SynchronizedSingletonPattern.getInstance().getDescription();
        log.info(synchronizedImplementation);

        String doubleCheckedLocked = DoubleCheckedLockingSingletonPattern.getInstance().getDescription();
        log.info(doubleCheckedLocked);

        String enumImplementation = EnumSingletonPattern.UNIQUE_INSTANCE.getDescription();
        log.info(enumImplementation);
    }

}
