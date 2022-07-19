package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static void runGame(Interface game, String name) {
        System.out.println(game.gameQuestion());
        final int roundToWin = 3;
        boolean win = false;
        for (int i = 0; i < roundToWin; i++) {
            String[] questionAnswer = game.testAnswer();
            System.out.println("Question: " + questionAnswer[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            var answer = scanner.next();
            if (answer.equals(questionAnswer[1])) {
                System.out.println("Correct!");
                win = true;
            } else {
                System.out.print(answer + " is wrong answer ;(. Correct answer was '" + questionAnswer[1] + "'. ");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (win) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public final String greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
