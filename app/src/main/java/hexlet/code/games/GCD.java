package hexlet.code.games;

import hexlet.code.Randomizer;
/*import hexlet.code.Engine;*/

import java.util.Scanner;
public class GCD {
    private static final int MAX_ROUNDS = 3;
    public static int findRod(int randomNumber1, int randomNumber2) {
        if (randomNumber1 < randomNumber2) {
            var min = randomNumber1;
            var max = randomNumber2;
            var rod = max % min;
            while (rod != 0) {
                max = min;
                min = rod;
                rod = max % min;
            }
            return min;
        } else {
            var min = randomNumber2;
            var max = randomNumber1;
            var rod = max % min;
            while (rod != 0) {
                max = min;
                min = rod;
                rod = max % min;
            }
            return min;
        }
    }
    public static void isGCD() {
        var rule = "Find the greatest common divisor of given numbers.";
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
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (userAnswer.equals(Integer.toString(findRod(randomNumber1, randomNumber2)))) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(.");
                System.out.print("Correct answer was '" + findRod(randomNumber1, randomNumber2) + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == MAX_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
