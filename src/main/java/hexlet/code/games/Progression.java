package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
public class Progression {
    public static void game() {
        var question = "What number is missing in the progression?";
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.ROUND][2];
        for (var x = 0; x < Engine.ROUND; x++) {
            final var arrayLength = random.nextInt(5, 11);
            var step = Utils.randomBound();
            var firstNumber = Utils.randomBound();
            var array = progressionBuild(step, arrayLength, firstNumber);
            String[] arrayString = new String[arrayLength];
            for (var i = 0; i < arrayString.length; i++) {
                arrayString[i] = Integer.toString(array[i]);
            }
            var answerNumber = random.nextInt(arrayLength);
            var answer = arrayString[answerNumber];
            arrayString[answerNumber] = "..";
            questionAndAnswer[x][1] = answer;
            questionAndAnswer[x][0] = String.join(" ", arrayString);
        }
        Engine.runGame(questionAndAnswer, question);
    }
    public static int[]  progressionBuild(int step, int arrayLength, int firstNumber) {
        int[] array = new int[arrayLength];
        array[0] = firstNumber;
        for (var i = 1; i < array.length; i++) {
            array[i] = array[0] + (i - 1) * step;
        }
        return array;
    }
}

