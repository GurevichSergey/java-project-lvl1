package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class Engine {
    public static final int ROUND = 3;
    public static void runGame(String[][] questionAndAnswer, String question) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        for (int i = 0; i < ROUND; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            var answer = scanner.next();
            if (answer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionAndAnswer[i][1]);
                System.out.println("'. Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static int randomBound() {
        Random random = new Random();
        final int bound = 100;
        return random.nextInt(bound);
    }
}

