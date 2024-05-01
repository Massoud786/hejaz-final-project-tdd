package tdd.finalProject.utilities;

import java.util.Random;

public class RandomDataGeneratorUtilities {
    public static String randomEmail() {
        String emailPrefix = "Hejaz";
        int randomNumber = new Random().nextInt(1000);
        return emailPrefix + "_" + randomNumber + "@yahoo.com";
    }
}
