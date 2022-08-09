package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    public static void game() {
        var question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.ROUND][2];
        for (var x = 0; x < Engine.ROUND; x++) {
            var questionNumber = Utils.randomBound();
            questionAndAnswer[x][1] = isPrime(questionNumber) ? "yes" : "no";
            questionAndAnswer[x][0] = Integer.toString(questionNumber);
        }
        Engine.runGame(questionAndAnswer, question);
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
            }
        for (var i = 2; i < number / 2; i++) {
            var check = number % i;
            if (check == 0) {
                return false;
            }
        }
        return true;
    }
}
