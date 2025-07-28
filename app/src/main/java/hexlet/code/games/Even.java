package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int QUESTION_RANGE_NUMBER = 100;

    public static String[][] getQA() {
        String[][] qa = new String[Engine.ROUNDS][2];

        var i = 0;
        while (i < Engine.ROUNDS) {
            int number = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            qa[i][0] = String.valueOf(number);

            boolean even = (number % 2 == 0);
            qa[i][1] = even ? "yes" : "no";

            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), RULES);
    }

}
