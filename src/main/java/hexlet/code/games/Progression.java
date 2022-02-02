package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {

    private static String[] correctAnswers = new String[Engine.TOTAL_ROUNDS_IN_GAME];
    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX_NUMBER = 3;

    public static String[] getQuestions() {

        String[] questions = new String[Engine.TOTAL_ROUNDS_IN_GAME];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int startProgression = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
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
            questions[i] = progression.trim();
            Progression.correctAnswers[i] = String.valueOf(rightAnswer);
            ++i;
        }

        return questions;
    }

    public static void play() {
        System.out.println("What number is missing in the progression?");
        Engine.play(Cli.getGamerName(), Progression.getQuestions(), Progression.getCorrectAnswers());
    }

    public static String[] getCorrectAnswers() {
        return correctAnswers;
    }
}
