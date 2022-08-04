package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void game() {
        var question = "Answer 'yes' if number even otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.ROUND][2];
        for (var j = 0; j < Engine.ROUND; j++) {
            int questionNumber = Utils.randomBound();
            questionAndAnswer[j][1] = isEven(questionNumber) ? "yes" : "no";
            questionAndAnswer[j][0] = Integer.toString(questionNumber);
        }
        Engine.runGame(questionAndAnswer, question);
    }
    public static boolean isEven(int number) {
        boolean rightAnswer;
        rightAnswer = number % 2 == 0;
        return rightAnswer;
    }
}
