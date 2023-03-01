package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int CLI = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case CLI -> Cli.greeting();
            case EVEN -> Even.runEven();
            case CALC -> Calc.calcGame();
            case GCD_GAME -> GCD.isGCD();
            case PROGRESSION -> Progression.fillTheBlank();
            case PRIME -> Prime.startPrimeGame();
            case EXIT -> System.exit(0);
            default -> System.out.println("This game number doesn't exist. Sorry, try again.");
        }
        scanner.close();
    }
}
