package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var engine = new Engine();
        engine.greeting();
        Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (engine.round() < engine.getRoundToWin()) {
            int[] question = {random.nextInt(50), random.nextInt(50)};
            var string = Arrays.toString(question).replace(",", "").replace("[", "").replace("]", "");
            System.out.println("Question: " + string);
            var userAnswer = scan.nextInt();
            System.out.println("Your answer: " + userAnswer);
            var firsNumber = question[0];
            var secondNumber = question[1];
            var count = Math.min(firsNumber, secondNumber);
            for (int n = count; n >= 1; n--) {
                if (firsNumber % n == 0 && secondNumber % n == 0) {
                    count = n;
                    break;
                }
            }
            if (userAnswer == count) {
                engine.correctAnswer();
            } else {
                System.out.print(userAnswer + " is wrong answer ;(. Correct answer was " + count + ". ");
                System.out.println("Let's try again, " + engine.getName());
                break;
            }
        }
        engine.winMessage(engine.round());
    }
}
