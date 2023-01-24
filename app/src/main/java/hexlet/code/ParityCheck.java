package hexlet.code;

import java.util.Scanner;
public class ParityCheck {
    public static void Parity() {
        Cli.greeting();
        Scanner number = new Scanner(System.in);
        int randomNumber = Randomizer.getRandom();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if ((userAnswer.equals("yes") && (randomNumber % 2 == 0)) || ((userAnswer.equals("no")) && (randomNumber % 2 != 0))) {
                System.out.println("Correct!");
            } else {
                if (randomNumber % 2 == 0) {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'yes'. \nLet's try again, " + Cli.userName + "!");
                } else {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'no'. \nLet's try again, " + Cli.userName + "!");
                }
            }
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}
