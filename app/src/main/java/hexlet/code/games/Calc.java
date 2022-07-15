package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var engine = new Engine();
        engine.greeting();
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        while (engine.round() < engine.getRoundToWin()) {
            var number1 = random.nextInt();
            var number2 = random.nextInt();
            String[] array = {"*", "+", "-"};
            String operation = array[random.nextInt(array.length)];
            String question =  number1 + operation + number2;
            System.out.println("Question: " + question);
            var userAnswer = scan.nextInt();
            System.out.println("Your answer: " + userAnswer);
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
            if (userAnswer == result) {
                engine.correctAnswer();
            } else {
                System.out.print(userAnswer + " is wrong answer ;(. Correct answer was " + result + ". ");
                System.out.println("Let's try again, " + engine.getName());
                break;
            }
        } engine.winMessage(engine.round());
    }
}
