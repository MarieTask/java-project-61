package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.RandomOperationForProgression;
/*import hexlet.code.Engine;*/

import java.util.Scanner;

public class Progression {
    private static final int MAX_ROUNDS = 3;
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    public static String[] createMassive(int firstNumber, int diffBetweenTwoNum, char randomOperation, int length) {
        String[] strMassive = new String[length];
        int[] intMas = new int[length];
        intMas[0] = firstNumber;
        for (var i = 1; i < intMas.length; i++) {
            if (randomOperation == '-') {
                intMas[i] = intMas[i - 1] - diffBetweenTwoNum;
            } else if (randomOperation == '+') {
                intMas[i] = intMas[i - 1] + diffBetweenTwoNum;
            }
        }
        for (var j = 0; j < strMassive.length; j++) {
            strMassive[j] = String.valueOf(intMas[j]);
        }
        return strMassive;
    }
    public static String massiveWithHiddenSpot(String[] intMas, int hiddenSpot) {
        intMas[hiddenSpot] = "..";
        String stringWithHiddenSpot = String.join(" ", intMas);
        return stringWithHiddenSpot;
    }
    public static void fillTheBlank() {
        var rule = "What number is missing in the progression?";
        Scanner number = new Scanner(System.in);
        Scanner user = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        int count = 0;
        for (var i = 0; i < MAX_ROUNDS; i++) {
            int firstNumber = Randomizer.getRandom();
            int diffBetweenTwoNum = Randomizer.getRandom();
            var randomOperation = RandomOperationForProgression.getRandomOperationForProgression();
            int lengthOfProgression = Randomizer.getRandom(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            int hidIndex = lengthOfProgression - 2;
            String[] intMas = createMassive(firstNumber, diffBetweenTwoNum, randomOperation, lengthOfProgression);
            int secretNumber = (Integer.parseInt(intMas[hidIndex + 1]) + Integer.parseInt(intMas[hidIndex - 1])) / 2;
            String stringSecretNumber = Integer.toString(secretNumber);
            System.out.println("Question: " + massiveWithHiddenSpot(intMas, hidIndex));
            System.out.print("Your answer: ");
            String userAnswer = number.next();
            if (userAnswer.equals(stringSecretNumber)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(.");
                System.out.print("Correct answer was '" + stringSecretNumber + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == MAX_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
