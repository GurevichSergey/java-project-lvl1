package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Interface;

import java.util.Random;


public class Prime implements Interface {
    public final String gameQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public final String[] testAnswer() {
        final int bound = 200;
        Random random = new Random();
        var questionNumber = random.nextInt(bound);
        String answer = "yes";
        for (var i = 2; i < questionNumber / 2; i++) {
            var check = questionNumber % i;
            if (check == 0) {
                answer = "no";
                break;
            }
        }
        return new String[] {String.valueOf(questionNumber), answer};
    }
    public static void game() {
        var engine = new Engine();
        Interface prime = new Prime();
        String name = engine.greeting();
        Engine.runGame(prime, name);
    }
}