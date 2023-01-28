package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner user = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.print("Hello, " + userName + "!");
        user.close();
    }
}
