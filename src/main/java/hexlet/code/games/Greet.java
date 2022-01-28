package hexlet.code.games;

import java.util.Scanner;

public final class Greet implements Game {

    private String gamerName;

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

    public String getGamerName() {
        return gamerName;
    }
}
