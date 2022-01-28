package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.GameType;
import hexlet.code.games.Game;
import hexlet.code.games.Prime;

//import hexlet.code.games.Greet;
//import hexlet.code.games.Even;
//import hexlet.code.games.Calc;
//import hexlet.code.games.Gcd;
//import hexlet.code.games.Progression;
//import hexlet.code.games.GameType;
//import hexlet.code.games.Game;

public final class Engine {

    public static final int TOTAL_ROUNDS_IN_GAME = 3;
    public static final int QUESTION_RANGE_NUMBER = 100;

    public void chooseGame(int gameNumber) {

        if (gameNumber == GameType.EXIT.getNumber()) {
            return;
        }

        final Greet greet = new Greet();
        greet.play();
        String gamerName = greet.getGamerName();

        Game game = new Greet();
        if (gameNumber == GameType.EVEN.getNumber()) {
            game = new Even(gamerName);
        } else if (gameNumber == GameType.CALC.getNumber()) {
            game = new Calc(gamerName);
        } else if (gameNumber == GameType.GCD.getNumber()) {
            game = new Gcd(gamerName);
        } else if (gameNumber == GameType.PROGRESSION.getNumber()) {
            game = new Progression(gamerName);
        } else if (gameNumber == GameType.PRIME.getNumber()) {
            game = new Prime(gamerName);
        }

        game.play();
    }

}
