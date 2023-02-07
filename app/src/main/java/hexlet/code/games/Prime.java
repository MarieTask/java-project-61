package hexlet.code.games;

import hexlet.code.Randomizer;

import java.util.Scanner;
public class Prime {
    public static void isTrue() {
        int number = Randomizer.getRandom();
        for (var divider = 2; divider < 17; divider++) {
            if (divider > Math.sqrt(number)) {
                System.out.println("yes");
            } else if ((divider <= Math.sqrt(number) && (number % divider == 0))) {
                divider++;
            } else {
                System.out.println("no");
            }
        }
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
            if ((userAnswer.equals("no") && (randomNumber == 0)) || ((userAnswer.equals("no")) && (randomNumber == 1))) {
                System.out.println("Correct!");
                count++;
            } else if (((userAnswer.equals("yes") && isTrue())) || ((userAnswer.equals("no")) && isTrue())) {
                System.out.println("Correct!");
                count++;
            } else if ((userAnswer.equals("no")) && isTrue()) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'. \nLet's try again, " + userName + "!");
                break;
            } else if ((userAnswer.equals("yes")) && isTrue()) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'. \nLet's try again, " + userName + "!");
                break;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'. \nLet's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
