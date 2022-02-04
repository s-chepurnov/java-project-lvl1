package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {

    private static final String RULES = "What is the result of the expression?";
    private static final int QUESTION_RANGE_NUMBER = 100;

    public static String[][] getQA() {
        String[][] qa = new String[Engine.TOTAL_ROUNDS_IN_GAME][2];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            qa[i][Engine.Q_IDX] = String.valueOf(number);

            boolean even = (number % 2 == 0);
            qa[i][Engine.A_IDX] = even ? "yes" : "no";

            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), RULES);
    }

}
