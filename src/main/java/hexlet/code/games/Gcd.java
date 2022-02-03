package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {

    public static String[][] getQA() {
        String[][] qa = new String[Engine.TOTAL_ROUNDS_IN_GAME][2];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number1 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            int number2 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            qa[i][Engine.Q_IDX] = number1 + " " + number2;
            qa[i][Engine.A_IDX] = String.valueOf(gcd(number1, number2));

            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), getRules());
    }

    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
