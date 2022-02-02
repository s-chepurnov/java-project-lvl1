package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    private static String[] correctAnswers = new String[Engine.TOTAL_ROUNDS_IN_GAME];

    public static String[] getQuestions() {
        String[] questions = new String[Engine.TOTAL_ROUNDS_IN_GAME];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            questions[i] = String.valueOf(number);
            Prime.correctAnswers[i] = isPrime(number) ? "yes" : "no";
            ++i;
        }

        return questions;
    }

    public static void play() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.play(Cli.getGamerName(), Prime.getQuestions(), Prime.getCorrectAnswers());
    }

    public static String[] getCorrectAnswers() {
        return correctAnswers;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
