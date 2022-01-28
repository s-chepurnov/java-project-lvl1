package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Gcd {

    public static void play(String gamerName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        var correctAnswers = 0;

        while (correctAnswers < Engine.TOTAL_ROUNDS_IN_GAME) {
            Random r = new Random();

            int number1 = r.nextInt(Engine.QUESTION_RANGE_NUMBER);
            int number2 = r.nextInt(Engine.QUESTION_RANGE_NUMBER);

            System.out.println("Question: " + number1 + " " + number2);

            System.out.print("Your answer: ");

            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();

            int rightAnswer = gcd(number1, number2);
            if (answer == rightAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + gamerName + "!");
            }
        }

        System.out.println("Congratulations, " + gamerName + "!");
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
