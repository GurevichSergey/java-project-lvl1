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
            if (randomNumber % 2 == 0) {
                if (engine.getStringAnswer().equals("yes")) {
                    engine.correctAnswer();
                } else {
                    engine.setStringResult("yes");
                    engine.wrongStringAnswer();
                    break;
                }
            } else {
                if (engine.getStringAnswer().equals("no")) {
                    engine.correctAnswer();
                } else {
                    engine.setStringResult("no");
                    engine.wrongStringAnswer();
                    break;
                }
            }
        }
        engine.winMessage();
    }
}
