package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void greet() {
        var welcome = "Welcome to the Brain Games!";
        System.out.println(welcome);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String number = scanner.next();
        if (number.equals("1")) {
            Cli.greeting();
        }
        if (number.equals("2")) {
            greet();
            Even.isEven();
        }
        if (number.equals("3")) {
            greet();
            Calc.calcGame();
        }
        if (number.equals("4")) {
            greet();
            GCD.isGCD();
        }
        if (number.equals("5")) {
            greet();
            Progression.fillTheBlank();

        }
        scanner.close();
    }
}
