package crypto.theblockchainpost.designpatterns.singleton;

/**
 * This is the enum implementation.
 *
 * According to the book, it is the simplest and safest one.
 * By using enum we don't have to worry about the synchronization, class loading,
 * reflection, and serialization/deserialization issues.
 *
 * According to SonarLint it might now, because it is complaining.
 */
public enum EnumSingletonPattern {

    UNIQUE_INSTANCE;

    public String getDescription() {
        return "I'm the enum-singleton implementation";
    }

}
