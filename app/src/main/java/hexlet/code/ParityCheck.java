package hexlet.code;

import java.util.Scanner;
public class ParityCheck {
    public static void Parity() {
        var positiveAnswer = "yes";
        var negativeAnswer = "no";
        int randomNumber1 = (int) (Math.random() * 20 + 1);
        int randomNumber2 = (int) (Math.random() * 20 + 1);
        int randomNumber3 = (int) (Math.random() * 20 + 1);

        var cicle = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer '" + positiveAnswer + "' if the number is even, otherwise answer '" + negativeAnswer + "'.");
        System.out.println("Question: " + randomNumber1);
        System.out.print("Your answer: ");
        String userAnswer1 = scanner.next();
        if ((userAnswer1.equals(positiveAnswer) && (randomNumber1 % 2 == 0)) || ((userAnswer1.equals(negativeAnswer)) && (randomNumber1 % 2 != 0))) {
            System.out.println("Correct!");
            System.out.println("Question: " + randomNumber2);
            System.out.print("Your answer: ");
            String userAnswer2 = scanner.next();
            if ((userAnswer2.equals(positiveAnswer) && (randomNumber2 % 2 == 0)) || ((userAnswer2.equals(negativeAnswer)) && (randomNumber2 % 2 != 0))) {
                System.out.println("Correct!");
                System.out.println("Question: " + randomNumber3);
                System.out.print("Your answer: ");
                String userAnswer3 = scanner.next();
                if ((userAnswer3.equals(positiveAnswer) && (randomNumber3 % 2 == 0)) || ((userAnswer3.equals(negativeAnswer)) && (randomNumber3 % 2 != 0))) {
                    System.out.println("Correct!");
                    System.out.println("Congratulations, " + Cli.userName + "!");
                }
            }
        } else {
            System.out.println("'" + positiveAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + negativeAnswer + "'");
            System.out.println("Let's try again, ");
        }
    }
}
