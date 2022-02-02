package hexlet.code;

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

    public static void play(String gamerName, String[] questions, String[] rightAnswers) {
        var correctAnswers = 0;
        var i = 0;
        while (correctAnswers < Engine.TOTAL_ROUNDS_IN_GAME) {

            String question = questions[i];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String answer;
            try {
                Scanner sc = new Scanner(System.in);
                answer = sc.nextLine();
            } catch (Exception e) {
                return;
            }

            String rightAnswer = rightAnswers[i];

            if (isCorrectAnswer(answer, rightAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + gamerName + "!");
                return;
            }

            ++i;
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
