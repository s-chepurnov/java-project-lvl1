package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Prime {

    public static void play(String gamerName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var correctAnswers = 0;

        while (correctAnswers < Engine.TOTAL_ROUNDS_IN_GAME) {
            Random r = new Random();

            int number = r.nextInt(Engine.QUESTION_RANGE_NUMBER);

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            String answer = "";
            try {
                Scanner sc = new Scanner(System.in);
                answer = sc.nextLine();
            } catch (Exception e) {
                //ignore
            }

            boolean isPrime = isPrime(number);
            String rightAnswer = isPrime ? "yes" : "no";

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + gamerName + "!");
            }
        }

        System.out.println("Congratulations, " + gamerName + "!");
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
