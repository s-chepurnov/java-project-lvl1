package hexlet.code;

import java.util.Scanner;

public final class Engine {

    public static final int TOTAL_ROUNDS_IN_GAME = 3;
    public static final int Q_IDX = 0;
    public static final int A_IDX = 1;

    public static void play(String[][] qa, String rules) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String gamerName;
        try {
            Scanner sc = new Scanner(System.in);
            gamerName = sc.nextLine();
        } catch (Exception e) {
            return;
        }
        System.out.println("Hello, " + gamerName + "!");

        if (qa == null || qa.length == 0 || rules == null || rules.isEmpty()) {
            return;
        }

        System.out.println(rules);

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {

            String question = qa[i][Q_IDX];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String answer;
            try {
                Scanner sc = new Scanner(System.in);
                answer = sc.nextLine();
            } catch (Exception e) {
                return;
            }

            String rightAnswer = qa[i][A_IDX];

            if (isCorrectAnswer(answer, rightAnswer)) {
                System.out.println("Correct!");
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
