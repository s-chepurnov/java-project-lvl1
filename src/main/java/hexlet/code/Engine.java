package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public final class Engine {

    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static final int TOTAL_ROUNDS_IN_GAME = 3;
    public static final int QUESTION_RANGE_NUMBER = 100;

    public static void chooseGame(int gameNumber) {
        if (gameNumber == EXIT) {
            return;
        }

        String gamerName = Greet.play();

        if (gameNumber == EVEN) {
            Even.play(gamerName);
        } else if (gameNumber == CALC) {
            Calc.play(gamerName);
        } else if (gameNumber == GCD) {
            Gcd.play(gamerName);
        } else if (gameNumber == PROGRESSION) {
            Progression.play(gamerName);
        } else if (gameNumber == PRIME) {
            Prime.play(gamerName);
        }

    }

}
