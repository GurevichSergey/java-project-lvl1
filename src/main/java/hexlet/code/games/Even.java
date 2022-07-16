package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        var engine = new Engine();
        engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        while (engine.round() < engine.getRoundToWin()) {
            var randomNumber = random.nextInt(100);
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
