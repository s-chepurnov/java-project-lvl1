package hexlet.code.games;

public enum GameType {
    EXIT (0),
    GREET (1),
    EVEN  (2),
    CALC  (3);

    public final int number;

    GameType(int number) {
        this.number = number;
    }

}
