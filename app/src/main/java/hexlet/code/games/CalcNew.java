package hexlet.code.games;

import hexlet.code.RandomOperation;
import hexlet.code.Randomizer;

import java.util.Scanner;
public class CalcNew {
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
        Scanner user = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");

        Scanner number = new Scanner(System.in);
        int count = 0;
        for (var i = 0; i < 3; i++) {
            int randomNumber1 = Randomizer.getRandom();
            int randomNumber2 = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperation();

            System.out.println("Question: " + randomNumber1 + "" + randomOperation + "" + randomNumber2);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (userAnswer.equals(Integer.toString(count(randomNumber1, randomNumber2, randomOperation)))) {
                System.out.println("Correct!");
                count++;
            } else if (userAnswer != (Integer.toString(count(randomNumber1, randomNumber2, randomOperation)))) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + count(randomNumber1, randomNumber2, randomOperation) + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}