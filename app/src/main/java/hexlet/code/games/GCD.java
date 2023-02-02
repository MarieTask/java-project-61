package hexlet.code.games;

import hexlet.code.Randomizer;

import java.util.Scanner;
public class GCD {
    public static int findROD(int randomNumber1, int randomNumber2) {
        if (randomNumber1 < randomNumber2) {
            var min = randomNumber1;
            var max = randomNumber2;
            var ROD = max % min;
            while (ROD != 0) {
                max = min;
                min = ROD;
                ROD = max % min;
            }
            return min;
        } else {
            var min = randomNumber2;
            var max = randomNumber1;
            var ROD = max % min;
            while (ROD != 0) {
                max = min;
                min = ROD;
                ROD = max % min;
            }
            return min;
        }
    }
    public static void isGCD() {
        Scanner number = new Scanner(System.in);
        Scanner user = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        int count = 0;
        for (var i = 0; i < 3; i++) {
            int randomNumber1 = Randomizer.getRandom();
            int randomNumber2 = Randomizer.getRandom();
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (userAnswer.equals(Integer.toString(findROD(randomNumber1, randomNumber2)))) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + findROD(randomNumber1, randomNumber2) + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
