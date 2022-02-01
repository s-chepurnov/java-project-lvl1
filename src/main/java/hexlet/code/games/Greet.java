package hexlet.code.games;

import java.util.Scanner;

public final class Greet {

    public static String play() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String name = "";
        try {
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
        } catch (Exception e) {
            return "";
        }

        System.out.println("Hello, " + name + "!");
        return name;
    }

}
