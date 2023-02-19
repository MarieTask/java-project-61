package hexlet.code.games;

import hexlet.code.RandomOperation;
import hexlet.code.Randomizer;
import hexlet.code.Engine;

import java.util.Scanner;
public class Calc {
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
        String rule = "What is the result of the expression?";
        int countOfRounds = Engine.getCountOfRounds();
        Scanner number = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);
        int count = 0;
        for (var i = 0; i < countOfRounds; i++) {
            int randomNum1 = Randomizer.getRandom();
            int randomNum2 = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperation();

            System.out.println("Question: " + randomNum1 + " " + randomOperation + " " + randomNum2);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (userAnswer.equals(Integer.toString(count(randomNum1, randomNum2, randomOperation)))) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + count(randomNum1, randomNum2, randomOperation) + "'.");
                System.out.print("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == countOfRounds) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
