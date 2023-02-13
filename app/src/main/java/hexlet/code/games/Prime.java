package hexlet.code.games;

import hexlet.code.Randomizer;

import java.util.Scanner;
public class Prime {
    public static String isTrue(int randomNumber) {
        String result = "";
        int count = 0;
        if (randomNumber <= 1) {
            count++;
        }
        if (randomNumber == 2) {
            result = "yes";
        }
        for (int divider = 2; divider <= randomNumber / 2; divider++) {
            var modulo = randomNumber % divider;
            if (modulo == 0) {
                count++;
            }
        }
        if (count <= 0) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }
    public static void isPrime() {
        var rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Scanner number = new Scanner(System.in);
        Scanner user = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
        int count = 0;
        for (var i = 0; i < 3; i++) {
            int randomNumber = Randomizer.getRandom();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = number.next().toLowerCase();
            if (((userAnswer.equals("yes") && isTrue(randomNumber).equals("yes"))) || ((userAnswer.equals("no")) && isTrue(randomNumber).equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else if ((userAnswer.equals("no")) && isTrue(randomNumber).equals("yes")) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'. \nLet's try again, " + userName + "!");
                break;
            } else if ((userAnswer.equals("yes")) && isTrue(randomNumber).equals("no")) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'. \nLet's try again, " + userName + "!");
                break;
            /*} else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'. \nLet's try again, " + userName + "!");
                break;*/
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
