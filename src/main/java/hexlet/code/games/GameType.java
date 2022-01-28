package hexlet.code.games;

public enum GameType {
    EXIT(0),
    GREET(1),
    EVEN(2),
    CALC(3),
    GCD(4),
    PROGRESSION(5),
    PRIME(6);

    private final int number;

    GameType(int n) {
        this.number = n;
    }

    public int getNumber() {
        return number;
    }
}
