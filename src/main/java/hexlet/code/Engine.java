package hexlet.code;

import java.util.Scanner;

public class Engine {
    private String name;
    private final int roundToWin = 3;
    private int round = 0;
    private int numberAnswer;
    private String stringAnswer;
    public final void numberQuestion() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choice: ");
        numberAnswer = scan.nextInt();
    }
    public final void stringQuestion() {
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
    public final String getName() {
        return name;
    }
    public final int round() {
        return round;
    }
    public final void correctAnswer() {
        System.out.println("Correct!");
        round++;
    }
    public final int getRoundToWin() {
        return roundToWin;
    }
    public final void winMessage() {
        if (round() == roundToWin) {
            System.out.println("Congratulations, " + name);
        }
    }
}
