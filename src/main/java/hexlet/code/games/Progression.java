package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression {

    private static String correctAnswer = "";
    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX_NUMBER = 3;

    public static String getQuestion() {
        int startProgression = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
        int step = Utils.getRandomInt(STEP_MAX_NUMBER) + 1;
        int hiddenElement = Utils.getRandomInt(PROGRESSION_LENGTH);

        int rightAnswer = 0;
        String progression = "";
        int currentElement = startProgression;
        for (int i = 0; i < PROGRESSION_LENGTH; ++i) {

            if (i == hiddenElement) {
                progression += " ..";
                rightAnswer = currentElement;
            } else {
                progression += " " + currentElement;
            }
            currentElement = currentElement + step;
        }

        Progression.correctAnswer = String.valueOf(rightAnswer);
        return progression;
    }

    public static void play(String gamerName) {
        System.out.println("What number is missing in the progression?");
        Engine.play(gamerName, Engine.PROGRESSION);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
