package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;


public class Gcd {
    public static void game() {
        var question = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[Engine.ROUND][2];
        for (var x = 0; x < Engine.ROUND; x++) {
            int[] questionNumber = {Utils.randomBound(), Utils.randomBound()};
            var stringQuestion = Arrays.toString(questionNumber).replace(",", "").replace("[", "").replace("]", "");
            questionAndAnswer[x][0] = stringQuestion;
            var firstNumber = questionNumber[0];
            var secondNumber = questionNumber[1];
            questionAndAnswer[x][1] = Integer.toString(gcdCheck(firstNumber, secondNumber));
        }
        Engine.runGame(questionAndAnswer, question);
    }
    public static int gcdCheck(int firstNumber, int secondNumber) {
        var answer = Math.min(firstNumber, secondNumber);
        for (int n = answer; n >= 1; n--) {
            if (firstNumber % n == 0 && secondNumber % n == 0) {
                answer = n;
                break;
            }
        }
        if (answer == 0) {
            answer = Math.max(firstNumber, secondNumber);
        }
        return answer;
    }
}
