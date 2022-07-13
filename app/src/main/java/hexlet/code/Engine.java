package hexlet.code;

import java.util.Scanner;

public class Engine {
    private String name;
    public void greeting() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Hello, " + name + "!");
    }
    public String getName() {
        return name;

    }
    public String name() {
        return name;
    }

    public void winMessage(int round) {
        if (round >= 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}
