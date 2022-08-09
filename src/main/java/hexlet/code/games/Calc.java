package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;


public class Calc {
    public static void game() {
        var question = "What is the result of the expression?";
        Random random = new Random();
        var questionAndAnswer = new String[Engine.ROUND][2];
        var array = new String[]{"*", "+", "-"};
        for (var x = 0; x < Engine.ROUND; x++) {
            var number1 = Utils.randomBound();
            var number2 = Utils.randomBound();
            String operation = array[random.nextInt(array.length)];
            questionAndAnswer[x][0] = number1 + " " + operation + " " + number2;
            var answer = calculate(number1, number2, operation);
            questionAndAnswer[x][1] = Integer.toString(answer);
        }
        Engine.runGame(questionAndAnswer, question);
    }
    public static int calculate(int firstNumber, int secondNumber, String operation) {
        int answer;
        switch (operation) {
            case "+":
                answer = firstNumber + secondNumber;
                break;
            case "-":
                answer = firstNumber - secondNumber;
                break;
            case "*":
                answer = firstNumber * secondNumber;
                break;
            default:
                throw new RuntimeException("Operator not defined correctly");
        }
        return answer;
    }
}
