package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Calc {
    public static void game() {
        var question = "What is the result of the expression?";
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.ROUND][2];
        String[] array = {"*", "+", "-"};
        for (var x = 0; x < Engine.ROUND; x++) {
            var number1 = Engine.randomBound();
            var number2 = Engine.randomBound();
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
