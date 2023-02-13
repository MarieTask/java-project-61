package hexlet.code.games;

import hexlet.code.Randomizer;

import hexlet.code.RandomOperationForProgression;

import java.util.Scanner;

public class Progression {
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    public static String[] createMassive(int firstNumber, int differenceBetweenTwoNumbers, char randomOperation, int length) {
        String[] strMassive = new String[length];
        int[] intMassive = new int[length];
        intMassive[0] = firstNumber;
        for (var i = 1; i < intMassive.length; i++) {
            if (randomOperation == '-') {
                intMassive[i] = intMassive[i - 1] - differenceBetweenTwoNumbers;
            } else if (randomOperation == '+') {
                intMassive[i] = intMassive[i - 1] + differenceBetweenTwoNumbers;
            }
        }
        for (var j = 0; j < strMassive.length; j++) {
            strMassive[j] = String.valueOf(intMassive[j]);
        }
        return strMassive;
    }
    public static String massiveWithHiddenSpot(String[] intMassive, int hiddenSpot) {
        intMassive[hiddenSpot] = "..";
        String stringWithHiddenSpot = String.join(" ", intMassive);
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
        for (var i = 0; i < 3; i++) {
            int firstNumber = Randomizer.getRandom();
            int differenceBetweenTwoNumbers = Randomizer.getRandom();
            var randomOperation = RandomOperationForProgression.getRandomOperationForProgression();
            int hiddenSpotIndex = Math.abs(Randomizer.getRandom(1, (MIN_LENGTH_OF_PROGRESSION - 1)));
            int lengthOfProgression = Randomizer.getRandom(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            String[] intMassive = createMassive(firstNumber, differenceBetweenTwoNumbers, randomOperation, lengthOfProgression);
            int secretNumber = (Integer.parseInt(intMassive[hiddenSpotIndex + 1]) + Integer.parseInt(intMassive[hiddenSpotIndex - 1])) / 2;
            String stringSecretNumber = Integer.toString(secretNumber);
            System.out.println("Question: " + massiveWithHiddenSpot(intMassive, hiddenSpotIndex));
            System.out.print("Your answer: ");
            String userAnswer = number.next();
            if (userAnswer.equals(stringSecretNumber)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + stringSecretNumber + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
