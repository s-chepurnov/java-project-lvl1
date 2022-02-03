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
        System.out.print("Your choice: ");

        int gameNumber;
        try {
            Scanner sc = new Scanner(System.in);
            gameNumber = sc.nextInt();
        } catch (Exception e) {
            return;
        }

        if (gameNumber == Engine.EXIT) {
            return;
        }

        switch (gameNumber) {
            case Engine.GREET -> Engine.greet();
            case Engine.EVEN -> Even.play();
            case Engine.CALC -> Calc.play();
            case Engine.GCD -> Gcd.play();
            case Engine.PRIME -> Prime.play();
            case Engine.PROGRESSION -> Progression.play();
            default -> throw new RuntimeException("There is no such a game");
        }

    }
}
