package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {

    public static final String RULES = "What number is missing in the progression?";
    public static final int QUESTION_RANGE_NUMBER = 100;
    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX_NUMBER = 3;

    public static String[][] getQA() {

        String[][] qa = new String[Engine.TOTAL_ROUNDS_IN_GAME][2];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int startProgression = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            int step = Utils.getRandomInt(STEP_MAX_NUMBER) + 1;
            int hiddenElement = Utils.getRandomInt(PROGRESSION_LENGTH);

            int rightAnswer = 0;
            String progression = "";
            int currentElement = startProgression;
            for (int j = 0; j < PROGRESSION_LENGTH; ++j) {

                if (j == hiddenElement) {
                    progression += " ..";
                    rightAnswer = currentElement;
                } else {
                    progression += " " + currentElement;
                }
                currentElement = currentElement + step;
            }
            qa[i][Engine.Q_IDX] = progression.trim();
            qa[i][Engine.A_IDX] = String.valueOf(rightAnswer);

            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), RULES);
    }

}
