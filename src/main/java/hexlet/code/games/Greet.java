package hexlet.code.games;

import java.util.Scanner;

public final class Greet {

    public static String play() {
        System.out.println("Welcome to the Brain Games!");

        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

}
