package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void game() {
        var question = "Answer 'yes' if number even otherwise answer 'no'.";
        final int bound = 10000;
        var engine = new Engine();
        Random random = new Random();
        String[] rightAnswer = new String[engine.getRound()];
        String[] questionGame = new String[engine.getRound()];
        for (var x = 0; x < engine.getRound(); x++) {
            int questionNumber = random.nextInt(bound);
            if (questionNumber % 2 == 0) {
                rightAnswer[x] = "yes";
            } else {
                rightAnswer[x] = "no";
            }
            questionGame[x] = Integer.toString(questionNumber);
        }
        Engine.runGame(rightAnswer, questionGame, question);
    }
}
