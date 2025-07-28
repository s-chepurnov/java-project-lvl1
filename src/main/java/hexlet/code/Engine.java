package hexlet.code;

import java.util.Scanner;

public final class Engine {

    public static final int ROUNDS = 3;

    public static void play(String[][] qa, String rules) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String gamerName = sc.nextLine();
        System.out.println("Hello, " + gamerName + "!");

        System.out.println(rules);

        for (String[] round : qa) {

            String question = round[0];
            String rightAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + gamerName + "!");
                return;
            }

        }

        System.out.println("Congratulations, " + gamerName + "!");
    }

}
