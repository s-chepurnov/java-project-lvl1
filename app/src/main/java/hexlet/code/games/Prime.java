package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int QUESTION_RANGE_NUMBER = 100;

    public static String[][] getQA() {
        String[][] qa = new String[Engine.ROUNDS][2];

        var i = 0;
        while (i < Engine.ROUNDS) {
            int number = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            qa[i][0] = String.valueOf(number);
            qa[i][1] = isPrime(number) ? "yes" : "no";

            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), RULES);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


}
