package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Greeting;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc");
        System.out.println("4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scan = new Scanner(System.in);
        var number = scan.nextInt();
        System.out.println("Your choice: " + number);
        switch (number) {
            case 1:
                Greeting.main(args);
                break;
            case 2:
                Even.main(args);
                break;
            case 3:
                Calc.main(args);
                break;
            case 4:
                Gcd.main(args);
                break;
            case 5:
                Progression.main(args);
                break;
            case 6:
                Prime.main(args);
                break;
            default:
                break;
        }
    }
}