package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime {

    private static String correctAnswer = "";

    public static String getQuestion() {
        int number = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
        String question = String.valueOf(number);

        Prime.correctAnswer = isPrime(number) ? "yes" : "no";

        return question;
    }

    public static void play(String gamerName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.play(gamerName, Engine.PRIME);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
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
