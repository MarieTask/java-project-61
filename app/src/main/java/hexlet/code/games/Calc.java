package hexlet.code.games;

import hexlet.code.RandomOperation;
import hexlet.code.Randomizer;

import java.util.Scanner;

public class Calc {
    public static void isExpressionTrue() {
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

            String addition = randomNumber1 + "+" + randomNumber2;
            String subtraction = randomNumber1 + "-" + randomNumber2;
            String multiplication = randomNumber1 + "*" + randomNumber2;
            String[] expressions = {addition, subtraction, multiplication};

            int sum = randomNumber1 + randomNumber2;
            int difference = randomNumber1 - randomNumber2;
            int productOfTwoNumbers = randomNumber1 * randomNumber2;
            int[] results = {sum, difference, productOfTwoNumbers};

            var numberOfChoice = (int) (Math.random() * 3);

            String strRightAnswer = expressions[numberOfChoice];
            int intRightAnswer = results[numberOfChoice];

            System.out.println("Question: " + strRightAnswer);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (userAnswer.equals(Integer.toString(intRightAnswer))) {
                System.out.println("Correct!");
                count++;
            } else if (userAnswer != Integer.toString(intRightAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + intRightAnswer + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}