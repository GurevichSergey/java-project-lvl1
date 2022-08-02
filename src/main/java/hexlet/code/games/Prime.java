package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    public static void game() {
        var question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.ROUND][2];
        for (var x = 0; x < Engine.ROUND; x++) {
            var questionNumber = Utils.randomBound();
            questionAndAnswer[x][1] = isPrime(questionNumber);
            questionAndAnswer[x][0] = Integer.toString(questionNumber);
        }
        Engine.runGame(questionAndAnswer, question);
    }
    public static String isPrime(int number) {
        var answer = "yes";
        if (number == 0) {
            answer = "no";
            return answer;
        }
        for (var i = 2; i < number / 2; i++) {
            var check = number % i;
            if (check == 0 ) {
                answer = "no";
                break;
            }
        }
        return answer;
    }
}
