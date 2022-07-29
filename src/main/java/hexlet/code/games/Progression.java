package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Progression {
    public static void game() {
        var question = "What number is missing in the progression?";
        Random random = new Random();
        final var bound = 100;
        var engine = new Engine();
        String[] rightAnswer = new String[engine.getRound()];
        String[] questionGame = new String[engine.getRound()];
        for (var x = 0; x < engine.getRound(); x++) {
            final var randomBound = random.nextInt(5, 11);
            int[] array = new int[randomBound];
            array[0] = random.nextInt(bound);
            var step = random.nextInt(bound);
            for (var i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + step;
            }
            var answerNumber = random.nextInt(randomBound);
            String[] arrayString = new String[array.length];
            for (var i = 0; i < arrayString.length; i++) {
                arrayString[i] = Integer.toString(array[i]);
            }
            var answer = arrayString[answerNumber];
            arrayString[answerNumber] = "..";
            rightAnswer[x] = answer;
            questionGame[x] = String.join(" ", arrayString);
        }
        Engine.runGame(rightAnswer, questionGame, question);
    }
}