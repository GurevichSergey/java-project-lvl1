package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void game() {
        var question = "Answer 'yes' if number even otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.ROUND][2];
        for (var x = 0; x < Engine.ROUND; x++) {
            int questionNumber = Engine.randomBound();
            questionAndAnswer[x][1] = evenCheck(questionNumber);
            questionAndAnswer[x][0] = Integer.toString(questionNumber);
        }
        Engine.runGame(questionAndAnswer, question);
    }
    public static String evenCheck(int number) {
        String rightAnswer;
        if (number % 2 == 0) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        return rightAnswer;
    }
}
