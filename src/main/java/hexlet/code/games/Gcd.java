package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {

    private static String[] correctAnswers = new String[Engine.TOTAL_ROUNDS_IN_GAME];

    public static String[] getQuestions() {
        String[] questions = new String[Engine.TOTAL_ROUNDS_IN_GAME];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number1 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            int number2 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            questions[i] = number1 + " " + number2;

            Gcd.correctAnswers[i] = String.valueOf(gcd(number1, number2));
            ++i;
        }

        return questions;
    }

    public static void play() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.play(Cli.getGamerName(), Gcd.getQuestions(), Gcd.getCorrectAnswers());
    }

    public static String[] getCorrectAnswers() {
        return correctAnswers;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
