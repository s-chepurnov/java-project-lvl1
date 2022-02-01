package hexlet.code.games;

import hexlet.code.Engine;

public final class Gcd {

    private static String correctAnswer = "";

    public static String getQuestion() {
        int number1 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
        int number2 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
        String question = number1 + " " + number2;

        Gcd.correctAnswer = String.valueOf(gcd(number1, number2));

        return question;
    }

    public static void play(String gamerName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.play(gamerName, Engine.GCD);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
