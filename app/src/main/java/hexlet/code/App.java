package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String number = scanner.next();
        if (number.equals("1")) {
            Cli.greeting();
        }
        if (number.equals("2")) {
            ParityCheck.Parity();
        }
        scanner.close();
    }
}
