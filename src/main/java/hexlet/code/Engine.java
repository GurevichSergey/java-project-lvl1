package hexlet.code;

import java.util.Scanner;
import java.util.Random;
public class Engine {
    private String name;
    private final int roundToWin = 3;
    private int round = 0;
    private int numberAnswer;
    private String stringAnswer;
    private int numberResult;
    private String stringResult;
    public final int getRandomNumber() {
        Random random = new Random();
        final int bound = 100;
        return random.nextInt(bound);
    }
    public final int getRandomArrayLength() {
        Random random = new Random();
        final int beginningBound = 5;
        final int endingBound = 11;
        return random.nextInt(beginningBound, endingBound);
    }
    public final void setStringResult(String result) {
        stringResult = result;
    }
    public final void setNumberResult(int result) {
        numberResult = result;
    }
    public final void numberUserAnswer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choice: ");
        numberAnswer = scan.nextInt();
    }
    public final void stringUserAnswer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choice: ");
        stringAnswer = scan.next();
    }
    public final String getStringAnswer() {
        return stringAnswer;
    }
    public final int getNumberAnswer() {
        return numberAnswer;
    }

    public final void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Hello, " + name + "!");
    }

    public final int round() {
        return round;
    }
    public final void correctAnswer() {
        System.out.println("Correct!");
        round++;
    }
    public final void wrongNumberAnswer() {
        System.out.print(numberAnswer + " is wrong answer ;(. Correct answer was " + numberResult + ". ");
        System.out.println("Let's try again, " + name + "!");
    }
    public final void wrongStringAnswer() {
        System.out.print(stringAnswer + " is wrong answer ;(. Correct answer was " + stringResult + ". ");
        System.out.println("Let's try again, " + name + "!");
    }
    public final int getRoundToWin() {
        return roundToWin;
    }
    public final void winMessage() {
        if (round() == roundToWin) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
