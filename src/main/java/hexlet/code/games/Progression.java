package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Progression {

    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX_NUMBER = 3;

    public static void play(String gamerName) {
        System.out.println("What number is missing in the progression?");
        var correctAnswers = 0;

        while (correctAnswers < Engine.TOTAL_ROUNDS_IN_GAME) {

            Random r = new Random();
            int startProgression = r.nextInt(Engine.QUESTION_RANGE_NUMBER);
            int step = r.nextInt(STEP_MAX_NUMBER) + 1;
            int hiddenElement = r.nextInt(PROGRESSION_LENGTH);

            int rightAnswer = 0;
            String progression = "";
            int currentElement = startProgression;
            for (int i = 0; i < PROGRESSION_LENGTH; ++i) {

                if (i == hiddenElement) {
                    progression += " ..";
                    rightAnswer = currentElement;
                } else {
                    progression += " " + currentElement;
                }
                currentElement = currentElement + step;
            }

            System.out.println("Question: " + progression);
            System.out.print("Your answer: ");

            int answer = 0;
            try {
                Scanner sc = new Scanner(System.in);
                answer = sc.nextInt();
            } catch (Exception e) {
                return;
            }

            if (answer == rightAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + gamerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + gamerName + "!");
    }

}
