package hexlet.code;

import java.util.Scanner;
import java.util.Random;

class Cli {

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");

        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
    }

}
