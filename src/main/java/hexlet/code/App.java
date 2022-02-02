package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = sc.nextInt();

        System.out.println("");

        if (gameNumber == Engine.EXIT) {
            return;
        }

        Cli.greet();

        if (gameNumber == Engine.EVEN) {
            Even.play();
        } else if (gameNumber == Engine.CALC) {
            Calc.play();
        } else if (gameNumber == Engine.GCD) {
            Gcd.play();
        } else if (gameNumber == Engine.PROGRESSION) {
            Progression.play();
        } else if (gameNumber == Engine.PRIME) {
            Prime.play();
        }
    }
}
