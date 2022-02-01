package hexlet.code.games;

import java.util.Random;

public class Utils {

    public static int getRandomInt(int upperBound) {
        Random r = new Random();
        return r.nextInt(upperBound);
    }

}
