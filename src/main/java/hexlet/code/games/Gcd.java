package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Interface;

import java.util.Arrays;
import java.util.Random;


public class Gcd implements Interface{
        public final String gameQuestion() {
            return "Find the greatest common divisor of given numbers.";
        }
    public final String[] testAnswer() {
        final int bound = 50;
        Random random = new Random();
        int[] question = {random.nextInt(bound), random.nextInt(bound)};
        var stringQuestion = Arrays.toString(question).replace(",", "").replace("[", "").replace("]", "");
        var firsNumber = question[0];
        var secondNumber = question[1];
        var answer = Math.min(firsNumber, secondNumber);
        for (int n = answer; n >= 1; n--) {
            if (firsNumber % n == 0 && secondNumber % n == 0) {
                answer = n;
                break;
            }
        }
        if (answer == 0) {
            answer = Math.max(firsNumber, secondNumber);
        }
        return new String[]{stringQuestion, String.valueOf(answer)};
    }
    public static void game() {
        var engine = new Engine();
        Interface gcd = new Gcd();
        String name = engine.greeting();
        Engine.runGame(gcd, name);
    }
}