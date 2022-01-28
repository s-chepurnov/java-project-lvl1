package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public final class Calc implements Game {

    public static final int OPERATOR_RANGE_NUMBER = 3;

    private final String gamerName;

    public Calc(String name) {
        this.gamerName = name;
    }

    @Override
    public void play() {
        System.out.println("What is the result of the expression?");
        var correctAnswers = 0;

        while (correctAnswers < Engine.TOTAL_ROUNDS_IN_GAME) {
            Random r = new Random();
            int number1 = r.nextInt(Engine.QUESTION_RANGE_NUMBER);
            int number2 = r.nextInt(Engine.QUESTION_RANGE_NUMBER);
            int operator = r.nextInt(OPERATOR_RANGE_NUMBER);

            int rightAnswer = 0;
            if (operator == 0) {
                System.out.println("Question: " + number1 + "+" + number2);
                rightAnswer = number1 + number2;
            } else if (operator == 1) {
                System.out.println("Question: " + number1 + "-" + number2);
                rightAnswer = number1 - number2;
            } else if (operator == 2) {
                System.out.println("Question: " + number1 + "*" + number2);
                rightAnswer = number1 * number2;
            }

            System.out.print("Your answer: ");

            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();

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

}
