package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ROUND = 3;

    public static int getCountOfRounds() {
        return MAX_ROUND;
    }
    private static final int ANSWER_PLUS_QUESTION = 2;
    public static int getValueOfArray() {
        return ANSWER_PLUS_QUESTION;
    }
    public static void startGame(String rule, String[][] info) {
        System.out.println("Welcome to the Brain Games!");
        Scanner user = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);

        for (var action: info) {
            System.out.println("Question: " + action[0]);
            System.out.print("Your answer: ");
            var userAnswer = user.next();
            if (userAnswer.equals(action[1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + action[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
