package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Calc {
    public static void calc() {
        var engine = new Engine();
        engine.greeting();
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        while (engine.round() < engine.getRoundToWin()) {
            var number1 = random.nextInt();
            var number2 = random.nextInt();
            String[] array = {"*", "+", "-"};
            String operation = array[random.nextInt(array.length)];
            String question =  number1 + " " + operation + " " + number2;
            System.out.println("Question: " + question);
            engine.stringUserAnswer();
            int result = 0;
            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                default:
                    break;
            }
            engine.setNumberResult(result);
            if (engine.getNumberAnswer() == result) {
                engine.correctAnswer();
            } else {
                engine.wrongNumberAnswer();
                break;
            }
        } engine.winMessage();
    }
}
