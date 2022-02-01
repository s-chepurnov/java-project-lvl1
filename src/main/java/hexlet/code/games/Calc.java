package hexlet.code.games;

import hexlet.code.Engine;

public final class Calc {

    private static String correctAnswer = "";
    private static final int OPERATOR_RANGE_NUMBER = 3;
    private static final String[] OPERATORS = {" + ", " - ", " * "};

    public static String getQuestion() {

        int number1 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
        int number2 = Utils.getRandomInt(Engine.QUESTION_RANGE_NUMBER);
        int operatorIdx = Utils.getRandomInt(OPERATOR_RANGE_NUMBER);

        String question = "Question: " + number1 + OPERATORS[operatorIdx] + number2;

        Calc.correctAnswer = calc(number1, number2, operatorIdx);

        return question;
    }

    public static void play(String gamerName) {
        System.out.println("What is the result of the expression?");
        Engine.play(gamerName, Engine.CALC);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static String calc(int number1, int number2, int operatorIdx) {
        return switch (operatorIdx) {
            case 0 -> String.valueOf(number1 + number2);
            case 1 -> String.valueOf(number1 - number2);
            case 2 -> String.valueOf(number1 * number2);
            default -> "0";
        };
    }

}
