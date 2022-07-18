package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;


public class Gcd {

    public static void gcd() {
        var engine = new Engine();
        engine.greeting();
        Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (engine.round() < engine.getRoundToWin()) {
            int[] question = {random.nextInt(), random.nextInt()};
            var string = Arrays.toString(question).replace(",", "").replace("[", "").replace("]", "");
            System.out.println("Question: " + string);
            engine.numberUserAnswer();
            var firsNumber = question[0];
            var secondNumber = question[1];
            var count = Math.min(firsNumber, secondNumber);
            for (int n = count; n >= 1; n--) {
                if (firsNumber % n == 0 && secondNumber % n == 0) {
                    count = n;
                    break;
                }
            }
            engine.setNumberResult(count);
            if (engine.getNumberAnswer() == count) {
                engine.correctAnswer();
            } else {
                engine.wrongNumberAnswer();
                break;
            }
        }
        engine.winMessage();
    }
}
