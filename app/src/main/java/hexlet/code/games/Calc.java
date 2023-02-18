package hexlet.code.games;

import hexlet.code.RandomOperation;
import hexlet.code.Randomizer;
// import hexlet.code.Engine;

import java.util.Scanner;
public class Calc {
    private static final int MAX_ROUNDS = 3;
    public static int count(int randomNumber1, int randomNumber2, char randomOperation) {

        var result = 0;
        if (randomOperation == '+') {
            result = randomNumber1 + randomNumber2;
        } else if (randomOperation == '-') {
            result = randomNumber1 - randomNumber2;
        } else if (randomOperation == '*') {
            result = randomNumber1 * randomNumber2;
        }
        return result;
    }
    public static void calcGame() {
        var rule = "What is the result of the expression?";
        Scanner number = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        int count = 0;
        for (var i = 0; i < MAX_ROUNDS; i++) {
            int randomNumber1 = Randomizer.getRandom();
            int randomNumber2 = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperation();

            System.out.println("Question: " + randomNumber1 + " " + randomOperation + " " + randomNumber2);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (userAnswer.equals(Integer.toString(count(randomNumber1, randomNumber2, randomOperation)))) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + count(randomNumber1, randomNumber2, randomOperation) + "'.");
                System.out.print("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == MAX_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
