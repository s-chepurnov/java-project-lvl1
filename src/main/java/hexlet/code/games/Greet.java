package hexlet.code.games;

import java.util.Scanner;

public class Greet implements Game {

    public String gamerName;

    public Greet() {
    }

    @Override
    public void play() {
        System.out.println("Welcome to the Brain Games!");

        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String name = sc.nextLine();
        this.gamerName = name;

        System.out.println("Hello, " + name + "!");
    }
}
