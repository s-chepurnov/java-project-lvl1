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
    public static final int Q_IDX = 0;
    public static final int A_IDX = 1;

    private static String gamerName;

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String name;
        try {
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
        } catch (Exception e) {
            return;
        }

        Engine.gamerName = name;
        System.out.println("Hello, " + name + "!");
    }

    public static void play(String[][] qa, String rules) {
        greet();

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
                System.out.println("Let's try again, " + getGamerName() + "!");
                return;
            }

            ++i;
        }

        System.out.println("Congratulations, " + getGamerName() + "!");
    }

    private static boolean isCorrectAnswer(String answer, String correctAnswer) {
        if (answer == null || answer.isEmpty()) {
            return false;
        }

        return correctAnswer.equals(answer.trim());
    }

    public static String getGamerName() {
        return gamerName;
    }
}
