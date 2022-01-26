package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int number = sc.nextInt();

        System.out.println("");

        Game game = new Game();

        if (number == Game.EXIT) {
            return;
        } else if (number == Game.GREET) {
            game.greet();
        } else if (number == Game.EVEN) {
            game.even();
        }
    }
}
