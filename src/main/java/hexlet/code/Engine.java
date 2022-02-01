package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public final class Engine {

    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static final int TOTAL_ROUNDS_IN_GAME = 3;
    public static final int QUESTION_RANGE_NUMBER = 100;

    public static void play(String gamerName, int gameNumber) {
        var correctAnswers = 0;

        while (correctAnswers < Engine.TOTAL_ROUNDS_IN_GAME) {

            String question = switch (gameNumber) {
                case EVEN -> Even.getQuestion();
                case CALC -> Calc.getQuestion();
                case GCD -> Gcd.getQuestion();
                case PROGRESSION -> Progression.getQuestion();
                case PRIME -> Prime.getQuestion();
                default -> "";
            };

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String answer;
            try {
                Scanner sc = new Scanner(System.in);
                answer = sc.nextLine();
            } catch (Exception e) {
                return;
            }

            String rightAnswer = switch (gameNumber) {
                case EVEN -> Even.getCorrectAnswer();
                case CALC -> Calc.getCorrectAnswer();
                case GCD -> Gcd.getCorrectAnswer();
                case PROGRESSION -> Progression.getCorrectAnswer();
                case PRIME -> Prime.getCorrectAnswer();
                default -> "";
            };

            if (isCorrectAnswer(answer, rightAnswer)) {
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

    private static boolean isCorrectAnswer(String answer, String correctAnswer) {
        if (answer == null || answer.isEmpty()) {
            return false;
        }

        return correctAnswer.equals(answer.trim());
    }

}
