package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int BOUND = 100;
    public static int randomBound() {
        Random random = new Random();
        return random.nextInt(BOUND);
    }
}
