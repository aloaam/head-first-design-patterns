package crypto.theblockchainpost.designpatterns;

import crypto.theblockchainpost.designpatterns.singleton.EnumSingletonPattern;

public class DesignPatternsMain {

    public static void main(String[] args) {

        // This is here just to show that the singleton pattern,
        // gives a global point of entry.
        String value = EnumSingletonPattern.UNIQUE_INSTANCE.getDescription();
        System.out.println(value);
    }

}
