package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();

        if (gameNumber == EXIT) {
            return;
        }

        switch (gameNumber) {
            case GREET -> Cli.greet();
            case EVEN -> Even.play();
            case CALC -> Calc.play();
            case GCD -> Gcd.play();
            case PRIME -> Prime.play();
            case PROGRESSION -> Progression.play();
            default -> throw new RuntimeException("There is no such a game: " + gameNumber);
        }

    }
}
