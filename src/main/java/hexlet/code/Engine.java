package hexlet.code;

import hexlet.code.games.*;

public class Engine {

    public static final int TOTAL_ROUNDS_IN_GAME = 3;
    public static final int QUESTION_RANGE_NUMBER = 100;

    public void chooseGame(int gameNumber) {

        if (gameNumber == GameType.EXIT.number) {
            return;
        }

        Greet greet = new Greet();
        greet.play();
        String gamerName = greet.gamerName;

        if (gameNumber == GameType.EVEN.number) {
            Game game = new Even(gamerName);
            game.play();
        } else if (gameNumber == GameType.CALC.number) {
            Game game = new Calc(gamerName);
            game.play();
        } else if (gameNumber == GameType.GCD.number) {
            Game game = new Gcd(gamerName);
            game.play();
        } else if (gameNumber == GameType.PROGRESSION.number) {
            Game game = new Progression(gamerName);
            game.play();
        }

    }

}
