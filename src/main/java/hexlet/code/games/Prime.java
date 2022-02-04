package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int QUESTION_RANGE_NUMBER = 100;

    public static String[][] getQA() {
        String[][] qa = new String[Engine.TOTAL_ROUNDS_IN_GAME][2];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            qa[i][Engine.Q_IDX] = String.valueOf(number);
            qa[i][Engine.A_IDX] = isPrime(number) ? "yes" : "no";

            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), RULES);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
