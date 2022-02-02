package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {

    private static String[] correctAnswers = new String[Engine.TOTAL_ROUNDS_IN_GAME];

    public static String[] getQuestions() {
        String[] questions = new String[Engine.TOTAL_ROUNDS_IN_GAME];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            questions[i] = String.valueOf(number);
            boolean even = (number % 2 == 0);
            Even.correctAnswers[i] = even ? "yes" : "no";
            ++i;
        }

        return questions;
    }

    public static String[] getCorrectAnswers() {
        return correctAnswers;
    }

    public static void play() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Engine.play(Cli.getGamerName(), Even.getQuestions(), Even.getCorrectAnswers());
    }

}
