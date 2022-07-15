package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var engine = new Engine();
        engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        var temp = 0;
        while (temp < 3) {
            var number = random.nextInt(100);
            System.out.println("Question: " + number);
            var userAnswer = scan.next();
            System.out.println("Your answer: " + userAnswer);
            String result = "yes";
            for (var i = 2; i < number / 2; i++) {
                var check = number % i;
                if (check == 0) {
                    result = "no";
                    break;
                }
            }
            if (userAnswer.equals(result)) {
                System.out.println("Correct!");
                temp++;
            } else {
                System.out.print(userAnswer + " is wrong answer ;(. Correct answer was " + result + ". ");
                System.out.println("Let's try again, " + engine.getName());
                break;
            }
        }
        engine.winMessage(temp);
    }
}
