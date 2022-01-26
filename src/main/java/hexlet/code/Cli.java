package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void hello() {

        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");

    }
}
