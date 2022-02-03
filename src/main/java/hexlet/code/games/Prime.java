package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    public static String[][] getQA() {
        String[][] qa = new String[Engine.TOTAL_ROUNDS_IN_GAME][2];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            qa[i][Engine.Q_IDX] = String.valueOf(number);
            qa[i][Engine.A_IDX] = isPrime(number) ? "yes" : "no";

            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), getRules());
    }

    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
