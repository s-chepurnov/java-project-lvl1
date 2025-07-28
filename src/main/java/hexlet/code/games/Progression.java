package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {

    public static final String RULES = "What number is missing in the progression?";
    public static final int QUESTION_RANGE_NUMBER = 100;
    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX_NUMBER = 3;

    public static String[][] getQA() {

        String[][] qa = new String[Engine.ROUNDS][2];

        var i = 0;
        while (i < Engine.ROUNDS) {
            int first = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            int step = Utils.getRandomInt(STEP_MAX_NUMBER) + 1;
            int hiddenIndex = Utils.getRandomInt(PROGRESSION_LENGTH - 1);

            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            String answer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            qa[i][0] = question;
            qa[i][1] = answer;

            ++i;
        }

        return qa;
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }


    public static void play() {
        Engine.play(getQA(), RULES);
    }

}
