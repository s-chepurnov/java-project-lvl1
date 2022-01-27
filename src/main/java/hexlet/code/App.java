package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = sc.nextInt();

        System.out.println("");

        Engine engine = new Engine();
        engine.chooseGame(gameNumber);
    }
}
