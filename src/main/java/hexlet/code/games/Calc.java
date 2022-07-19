package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Interface;

import java.util.Random;


public class Calc implements Interface{
    public final String gameQuestion() {
        return "What is the result of the expression?";
    }
    public final String[] testAnswer() {
        final int bound = 100;
        Random random = new Random();
        var number1 = random.nextInt(bound);
        var number2 = random.nextInt(bound);
        String[] array = {"*", "+", "-"};
        String operation = array[random.nextInt(array.length)];
        String question = number1 + " " + operation + " " + number2;
        int answer = 0;
        switch (operation) {
            case "+":
                answer = number1 + number2;
                break;
            case "-":
                answer = number1 - number2;
                break;
            case "*":
                answer = number1 * number2;
                break;
            default:
                break;
        }
        return new String[]{question, String.valueOf(answer)};
    }
    public static void game() {
        var engine = new Engine();
        Interface calc = new Calc();
        String name = engine.greeting();
        Engine.runGame(calc, name);
    }
}
