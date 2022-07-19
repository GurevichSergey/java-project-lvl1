package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Interface;

import java.util.Random;
public class Progression implements Interface {
    public final String gameQuestion() {
        return "What number is missing in the progression?";
    }
    public final String[] testAnswer() {
        Random random = new Random();
        final var bound = 100;
        final var randomBound = random.nextInt(5, 11);
        int[] array = new int[randomBound];
        array[0] = random.nextInt(bound);
        var step = random.nextInt(bound);
        for (var i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + step;
        }
        var answerNumber = random.nextInt(randomBound);
        String[] arrayString = new String[array.length];
        for (var x = 0; x < arrayString.length; x++) {
            arrayString[x] = Integer.toString(array[x]);
        }
        var answer = arrayString[answerNumber];
        arrayString[answerNumber] = "..";
        String joinedQuestionNumber = String.join(" ", arrayString);
        return new String[] {joinedQuestionNumber, answer};
    }
    public static void game() {
        var engine = new Engine();
        Interface progression = new Progression();
        String name = engine.greeting();
        Engine.runGame(progression, name);
    }
}
