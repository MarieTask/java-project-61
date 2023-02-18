package hexlet.code.games;

import hexlet.code.Randomizer;
/*import hexlet.code.Engine;*/

import java.util.Scanner;
public class Even {
    private static final int MAX_ROUNDS = 3;
    public static void isEven() {
        var rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Scanner number = new Scanner(System.in);
        Scanner user = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        int count = 0;
        for (var i = 0; i < MAX_ROUNDS; i++) {
            int randomNumber = Randomizer.getRandom();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (userAnswer.equals("yes") && randomNumber % 2 == 0 || userAnswer.equals("no") && randomNumber % 2 != 0) {
                System.out.println("Correct!");
                count++;
            } else if ((userAnswer.equals("no")) && (randomNumber % 2 == 0)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else if ((userAnswer.equals("yes")) && (randomNumber % 2 != 0)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'. ");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == MAX_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
