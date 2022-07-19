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
        System.out.print("Your choice: ");
        var number = scan.next();
        if ("1".equals(number)) {
            Greeting.greeting();
        } else if ("2".equals(number)) {
            Even.game();
        } else if ("3".equals(number)) {
            Calc.game();
        } else if ("4".equals(number)) {
            Gcd.game();
        } else if ("5".equals(number)) {
            Progression.game();
        } else if ("6".equals(number)) {
            Prime.game();
        }
    }
}
