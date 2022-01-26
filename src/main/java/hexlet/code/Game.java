package hexlet.code;

import java.util.Scanner;
import java.util.Random;

class Game {

    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;

    public static final int TOTAL_ATTEMPTS = 3;
    public static final int RANGE_MAX = 100;


    public String greet() {
        System.out.println("Welcome to the Brain Games!");

        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        return name;
    }

    public void even() {

        String gamerName = this.greet();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        var correctAnswers = 0;

        while (correctAnswers < TOTAL_ATTEMPTS) {

            Random r = new Random();

            int number = r.nextInt(RANGE_MAX);

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
