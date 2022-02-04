package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {

    private static final String RULES = "What is the result of the expression?";
    private static final int QUESTION_RANGE_NUMBER = 100;
    private static final int OPERATOR_RANGE_NUMBER = 3;
    private static final String[] OPERATORS = {" + ", " - ", " * "};

    public static String[][] getQA() throws Exception {
        String[][] qa = new String[Engine.TOTAL_ROUNDS_IN_GAME][2];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number1 = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            int number2 = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            int operatorIdx = Utils.getRandomInt(OPERATOR_RANGE_NUMBER);

            qa[i][Engine.Q_IDX] = number1 + OPERATORS[operatorIdx] + number2;
            qa[i][Engine.A_IDX] = calc(number1, number2, operatorIdx);
            ++i;
        }

        return qa;
    }

    public static void play() {
        try {
            Engine.play(getQA(), RULES);
        } catch (Exception e) {
            System.out.println("An error has been occurred during the Calc game: " + e.getMessage());
            return;
        }
    }

    public static String calc(int number1, int number2, int operatorIdx) throws Exception {
        return switch (operatorIdx) {
            case 0 -> String.valueOf(number1 + number2);
            case 1 -> String.valueOf(number1 - number2);
            case 2 -> String.valueOf(number1 * number2);
            default -> throw new Exception("Unknown operator type: " + operatorIdx);
        };
    }

}
