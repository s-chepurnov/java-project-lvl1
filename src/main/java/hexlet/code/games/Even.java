package hexlet.code.games;

import hexlet.code.Engine;

public final class Even {

    private static String correctAnswer = "";

    public static String getQuestion() {
        int number = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
        boolean even = (number % 2 == 0);
        Even.correctAnswer = even ? "yes" : "no";

        return String.valueOf(number);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static void play(String gamerName) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Engine.play(gamerName, Engine.EVEN);
    }
}
