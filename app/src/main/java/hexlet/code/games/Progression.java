package hexlet.code.games;

import hexlet.code.Randomizer;

import hexlet.code.RandomOperation;

import java.util.Scanner;

public class Progression {
    final MAX_LENGTH_OF_PROGRESSION = 10;
    public static String[] createMassive(int firstNumber, int differenceBetweenTwoNumbers, char randomOperation, int length) {
        String[] strMassive = new String[length];
        int[] intMassive = new int[length];
        var firstNumber = Randomizer.getRandom();
        strMassive[0] = firstNumber;
        for (var i = 1; i < length; i++) {
            if (randomOperation == '-') {
                intMassive[i] = intMassive[i - 1] - differenceBetweenTwoNumbers;
            } else if (randomOperation == '+') {
                intMassive[i] = intMassive[i - 1] + differenceBetweenTwoNumbers;
            } else (randomOperation == '*') {
                intMassive[i] = intMassive[i - 1] * differenceBetweenTwoNumbers;
            }
        }
        for (var j = 0; j < length; j++) {
            strMassive[j] = String.valueOf(intMassive[j]);
        }
    }
    public static void fillTheBlank() {
        var rule = "What number is missing in the progression?";
        Scanner number = new Scanner(System.in);
        Scanner user = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
    }
}
