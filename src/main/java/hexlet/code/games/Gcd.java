package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;


public class Gcd {
    public static void game() {
        var question = "Find the greatest common divisor of given numbers.";
        final int bound = 50;
        Random random = new Random();
        var engine = new Engine();
        String[] rightAnswer = new String[engine.getRound()];
        String[] questionGame = new String[engine.getRound()];
        for (var x = 0; x < engine.getRound(); x++) {
            int[] questionNumber = {random.nextInt(bound), random.nextInt(bound)};
            var stringQuestion = Arrays.toString(questionNumber).replace(",", "").replace("[", "").replace("]", "");
            questionGame[x] = stringQuestion;
            var firsNumber = questionNumber[0];
            var secondNumber = questionNumber[1];
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
            rightAnswer[x] = Integer.toString(answer);
        }
        Engine.runGame(rightAnswer, questionGame, question);
    }
}
