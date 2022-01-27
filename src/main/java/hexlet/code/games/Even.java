package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even implements Game {

    public String gamerName;

    public Even(String gamerName) {
        this.gamerName = gamerName;
    }

    @Override
    public void play() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        var correctAnswers = 0;

        while (correctAnswers < Engine.TOTAL_ROUNDS_IN_GAME) {

            Random r = new Random();
            int number = r.nextInt(Engine.QUESTION_RANGE_NUMBER);

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            boolean even = (number % 2 == 0);

            if (answer.equals("yes") && even) {
                System.out.println("Correct!");
                correctAnswers++;
            } else if (answer.equals("yes") && !even) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + gamerName + "!");
            } else if (answer.equals("no") && even) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + gamerName + "!");
            } else if (answer.equals("no") && !even) {
                System.out.println("Correct!");
                correctAnswers++;
            }

        }

        System.out.println("Congratulations, " + gamerName + "!");
    }
}
