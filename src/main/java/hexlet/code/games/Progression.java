package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void progression() {
        var engine = new Engine();
        engine.greeting();
        Random random = new Random();
        while (engine.round() < engine.getRoundToWin()) {
            var arrayLength = engine.getRandomArrayLength();
            int[] array = new int[arrayLength];
            array[0] = engine.getRandomNumber();
            var step = engine.getRandomNumber();
            for (var i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + step;
            }
            var questionNumber = random.nextInt(arrayLength);
            var result = array[questionNumber];
            String[] arrayString = new String[arrayLength];
            for (var x = 0; x < arrayString.length; x++) {
                arrayString[x] = Integer.toString(array[x]);
            }
            arrayString[questionNumber] = "..";
            String joined = String.join(" ", arrayString);
            System.out.println("Question: " + joined);
            engine.numberUserAnswer();
            engine.setNumberResult(result);
            if (engine.getNumberAnswer() == result) {
                engine.correctAnswer();
            } else {
                engine.wrongNumberAnswer();
                break;
            }
        }
        engine.winMessage();
    }
}
