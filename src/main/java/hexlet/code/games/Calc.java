package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Calc {
    public static void game() {
        var question = "What is the result of the expression?";
        final int bound = 100;
        var engine = new Engine();
        Random random = new Random();
        String[] rightAnswer = new String[engine.getRound()];
        String[] questionGame = new String[engine.getRound()];
        String[] array = {"*", "+", "-"};
        for (var x = 0; x < engine.getRound(); x++) {
            var number1 = random.nextInt(bound);
            var number2 = random.nextInt(bound);
            String operation = array[random.nextInt(array.length)];
            questionGame[x] = number1 + " " + operation + " " + number2;
            var answer = calculate(number1, number2, operation);
            rightAnswer[x] = Integer.toString(answer);
        }
        Engine.runGame(rightAnswer, questionGame, question);
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
