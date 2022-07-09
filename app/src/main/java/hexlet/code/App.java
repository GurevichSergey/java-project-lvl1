package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
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
        }
    }
}