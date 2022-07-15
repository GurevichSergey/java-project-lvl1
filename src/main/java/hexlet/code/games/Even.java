package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Scanner scan = new Scanner(System.in);
        var engine = new Engine();
        engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        while (engine.round() < engine.getRoundToWin()) {
            var randomNumber = random.nextInt();
            System.out.println("Question: " + randomNumber);
            var userAnswer = scan.next();
            System.out.println("Your answer: " + userAnswer);
            if (randomNumber % 2 == 0) {
                if (userAnswer.equals("yes")) {
                    engine.correctAnswer();
                } else {
                    System.out.print(userAnswer + " is wrong answer ;(. Correct answer was 'yes'. ");
                    System.out.println("Let's try again, " + engine.getName());
                    break;
                }
            } else {
                if (userAnswer.equals("no")) {
                    engine.correctAnswer();
                } else {
                    System.out.print(userAnswer + " is wrong answer ;(. Correct answer was 'no'. ");
                    System.out.println("Let's try again, " + engine.getName());
                    break;
                }
            }
        }
        engine.winMessage(engine.round());
    }
}
