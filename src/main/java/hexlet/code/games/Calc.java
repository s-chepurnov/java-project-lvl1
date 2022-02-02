package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {

    private static String[] correctAnswers = new String[Engine.TOTAL_ROUNDS_IN_GAME];
    private static final int OPERATOR_RANGE_NUMBER = 3;
    private static final String[] OPERATORS = {" + ", " - ", " * "};

    public static String[] getQuestions() throws Exception {
        String[] questions = new String[Engine.TOTAL_ROUNDS_IN_GAME];

        var i = 0;
        while (i < Engine.TOTAL_ROUNDS_IN_GAME) {
            int number1 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            int number2 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
            int operatorIdx = Utils.getRandomInt(OPERATOR_RANGE_NUMBER);

            questions[i] = number1 + OPERATORS[operatorIdx] + number2;
            Calc.correctAnswers[i] = calc(number1, number2, operatorIdx);
            ++i;
        }

        return questions;
    }

    public static void play() {
        System.out.println("What is the result of the expression?");
        try {
            Engine.play(Cli.getGamerName(), Calc.getQuestions(), Calc.getCorrectAnswers());
        } catch (Exception e) {
            System.out.println("An error has been occurred during the Calc game: " + e.getMessage());
            return;
        }
    }

    public static String[] getCorrectAnswers() {
        return correctAnswers;
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
