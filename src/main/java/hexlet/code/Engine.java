package hexlet.code;

import hexlet.code.games.*;

public class Engine {

    public static final int TOTAL_ROUNDS_IN_GAME = 3;
    public static final int QUESTION_RANGE_NUMBER = 15;
    public static final int OPERATOR_RANGE_NUMBER = 3;

    private Game game;

    public void chooseGame(int gameNumber) {

        if (gameNumber == GameType.EXIT.number) {
            return;
        }

        Greet greet = new Greet();
        greet.play();
        String gamerName = greet.gamerName;

        if (gameNumber == GameType.EVEN.number) {
            game = new Even(gamerName);
            game.play();
        } else if (gameNumber == GameType.CALC.number) {
            game = new Calc(gamerName);
            game.play();
        }

    }

}
