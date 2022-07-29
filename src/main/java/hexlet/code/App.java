package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc");
        System.out.println("4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choice: ");
        var number = scan.next();
        switch (number) {
            case "1":
                System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
                var name = scan.next();
                System.out.println("Hello, " + name + "!");
                break;
            case "2":
                Even.game();
                break;
            case "3":
                Calc.game();
                break;
            case "4":
                Gcd.game();
                break;
            case "5":
                Progression.game();
                break;
            case "6":
                Prime.game();
                break;
            default:
                break;
        }
    }
}
