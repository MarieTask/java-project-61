package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND = 3;
    public static final int ANSWER_PLUS_QUESTION = 2;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static void startGame(String rule, String[][] info) {
        System.out.println("Welcome to the Brain Games!");
        Scanner user = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);

        for (var roundData: info) {
            System.out.println("Question: " + roundData[QUESTION]);
            System.out.print("Your answer: ");
            var userAnswer = user.next();
            var correctAnswer = roundData[ANSWER];
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
