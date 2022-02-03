package hexlet.code;

import java.util.Scanner;

public class Cli {

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

        System.out.println("Hello, " + name + "!");
    }

}
