package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {

    private static final String RULES = "What is the result of the expression?";
    private static final int QUESTION_RANGE_NUMBER = 100;
    private static final int OPERATOR_RANGE_NUMBER = 3;
    private static final String[] OPERATORS = {" + ", " - ", " * "};

    public static String[][] getQA() {
        String[][] qa = new String[Engine.ROUNDS][2];

        var i = 0;
        while (i < Engine.ROUNDS) {
            int number1 = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            int number2 = Utils.getRandomInt(QUESTION_RANGE_NUMBER);
            int operatorIdx = Utils.getRandomInt(OPERATOR_RANGE_NUMBER);

            qa[i][0] = number1 + OPERATORS[operatorIdx] + number2;
            qa[i][1] = calc(number1, number2, operatorIdx);
            ++i;
        }

        return qa;
    }

    public static void play() {
        Engine.play(getQA(), RULES);
    }

    public static String calc(int number1, int number2, int operatorIdx) {
        return switch (operatorIdx) {
            case 0 -> String.valueOf(number1 + number2);
            case 1 -> String.valueOf(number1 - number2);
            case 2 -> String.valueOf(number1 * number2);
            default -> throw new RuntimeException("Unknown operator type: " + operatorIdx);
        };
    }

}
