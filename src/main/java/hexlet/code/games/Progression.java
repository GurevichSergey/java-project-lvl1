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
        final var arrayLength = random.nextInt(5, 11);
        int[] array = new int[arrayLength];
        array[0] = random.nextInt();
        var step = random.nextInt();
        for (var i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + step;
        }
        var answer = random.nextInt(arrayLength);
        String[] arrayString = new String[arrayLength];
        for (var x = 0; x < arrayString.length; x++) {
            arrayString[x] = Integer.toString(array[x]);
        }
        arrayString[answer] = "..";
        String joinedQuestionNumber = String.join(" ", arrayString);
        return new String[] {joinedQuestionNumber, String.valueOf(answer)};
    }
    public static void game() {
        var engine = new Engine();
        Interface progression = new Progression();
        String name = engine.greeting();
        Engine.runGame(progression, name);
    }
}