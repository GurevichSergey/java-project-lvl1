package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var temp = 0;
        Random random = new Random();
        while (temp < 3) {
            var randomNumber = random.nextInt();
            System.out.println("Question: " + randomNumber);
            var userAnswer = scan.next();
            System.out.println("Your answer: " + userAnswer);
            if (randomNumber % 2 == 0) {
                if (userAnswer.equals("yes")) {
                    System.out.println("Correct!");
                    temp++;
                } else {
                    System.out.print(userAnswer + " is wrong answer ;(. Correct answer was 'yes'. ");
                    System.out.println("Let's try again, " + name);
                    break;
                }
            } else {
                if (userAnswer.equals("no")) {
                    System.out.println("Correct!");
                    temp++;
                } else {
                    System.out.print(userAnswer + " is wrong answer ;(. Correct answer was 'no'. ");
                    System.out.println("Let's try again, " + name);
                    break;
                }
            }
        }
        if (temp == 3)  {
            System.out.println("Congratulations, " + name);
        }
    }
}
