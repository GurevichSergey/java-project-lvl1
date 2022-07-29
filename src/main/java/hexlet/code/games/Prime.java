package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Prime {
    public static void game() {
        var question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int bound = 200;
        var engine = new Engine();
        String[] rightAnswer = new String[engine.getRound()];
        String[] questionGame = new String[engine.getRound()];
        Random random = new Random();
        for (var x = 0; x < engine.getRound(); x++) {
            var questionNumber = random.nextInt(bound);
            rightAnswer[x] = "yes";
            questionGame[x] = Integer.toString(questionNumber);
            for (var i = 2; i < questionNumber / 2; i++) {
                var check = questionNumber % i;
                if (check == 0) {
                    rightAnswer[x] = "no";
                    break;
                }
            }
        }
        Engine.runGame(rightAnswer, questionGame, question);
    }
}
