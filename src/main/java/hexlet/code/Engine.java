package hexlet.code;

import java.util.Scanner;

public class Engine {
    private String name;
    private final int roundToWin = 3;
    private int round = 0;

    public void greeting() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Hello, " + name + "!");
    }
    public String getName() {
        return name;
    }
    public int round() {
        return round;
    }
    public void correctAnswer() {
        System.out.println("Correct!");
        round++;
    }
    public int getRoundToWin() {
        return roundToWin;
    }
    public void winMessage(int round) {
        if (round == roundToWin) {
            System.out.println("Congratulations, " + name);
        }
    }
}
