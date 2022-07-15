package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        System.out.println("Hello, " + name + "!");
    }
}
