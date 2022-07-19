package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Interface;

import java.util.Random;

public class Even  implements Interface {
    public final String gameQuestion() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }
    public final String[] testAnswer() {
        final int bound = 10000;
        Random random = new Random();
        int questionNumber = random.nextInt(bound);
        String answer;
        if (questionNumber % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return new String[] {String.valueOf(questionNumber), answer};
    }
    public static void game() {
        var engine = new Engine();
        Interface even = new Even();
        String name = engine.greeting();
        Engine.runGame(even, name);
    }
}
