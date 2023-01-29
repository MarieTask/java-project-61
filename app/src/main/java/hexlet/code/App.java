package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.CalcNew;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String number = scanner.next();
        if (number.equals("1")) {
            Cli.greeting();
        }
        if (number.equals("2")) {
            System.out.println("Welcome to the Brain Games!");
            Even.isEven();
        }
        if (number.equals("3")) {
            System.out.println("Welcome to the Brain Games!");
            Calc.isExpressionTrue();
        }
        if (number.equals("4")) {
            System.out.println("Welcome to the Brain Games!");
            CalcNew.calcGame();
        }
        scanner.close();
    }
}
