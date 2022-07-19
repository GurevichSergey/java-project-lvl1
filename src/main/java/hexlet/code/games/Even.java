package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void even() {
        var engine = new Engine();
        engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (engine.round() < engine.getRoundToWin()) {
            var randomNumber = engine.getRandomNumber();
            System.out.println("Question: " + randomNumber);
            engine.stringUserAnswer();
            String rightAnswer;
            if (randomNumber % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
                }
            engine.setStringResult(rightAnswer);
            if (engine.getStringAnswer().equals(rightAnswer)) {
                engine.winMessage();
            }
            else {
                engine.wrongStringAnswer();
                break;
            }
        }
        engine.winMessage();
    }
}
