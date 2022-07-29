package hexlet.code;

import java.util.Scanner;
public class Engine {
    private final int round = 3;
    public static void runGame(String[] rightAnswer, String[] questionGame, String question) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        var engine = new Engine();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        for (int i = 0; i < engine.getRound(); i++) {
            System.out.println("Question: " + questionGame[i]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            var answer = scanner.next();
            if (answer.equals(rightAnswer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer[i] + "'. ");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public final int getRound() {
        return round;
    }
}
