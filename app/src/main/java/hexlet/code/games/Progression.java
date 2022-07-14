package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var engine = new Engine();
        engine.greeting();
        Random random = new Random();
        var temp = 0;
        while (temp < 3) {
            var arrayLength = random.nextInt(5, 11);
            int[] array = new int[arrayLength];
            array[0] = random.nextInt(10);
            var step = random.nextInt(1, 7);
            for (var i = 1; i < array.length; i++) {
                array[i] = array[i-1] + step;
            }
            var questionNumber = random.nextInt(arrayLength);
            var result = array[questionNumber];
            String[] arrayString = new String[arrayLength];
            for (var x = 0; x < arrayString.length; x++) {
                arrayString[x] = Integer.toString(array[x]);
            }
            arrayString[questionNumber] = "..";
            String joined = String.join(" ", arrayString);
            System.out.println("Question: " + joined);
            var userAnswer = scan.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer == result) {
                System.out.println("Correct!");
                temp++;
            } else {
                System.out.print(userAnswer + " is wrong answer ;(. Correct answer was " + array[questionNumber] + ". ");
                System.out.println("Let's try again, " + engine.getName());
                break;
            }
        }
        engine.winMessage(temp);
    }
}
