package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.RandomOperation;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;

public class Progression {
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    public static String[] generateProgression(int firstNum, int step, char randomOperation, int length) {
        String[] strArray = new String[length];
        int[] intArray = new int[length];
        intArray[0] = firstNum;
        for (var i = 1; i < intArray.length; i++) {
            if (randomOperation == '-') {
                intArray[i] = intArray[i - 1] - step;
            } else if (randomOperation == '+') {
                intArray[i] = intArray[i - 1] + step;
            }
        }
        for (var j = 0; j < strArray.length; j++) {
            strArray[j] = String.valueOf(intArray[j]);
        }
        return strArray;
    }
    public static String massiveWithHiddenSpot(String[] intArray, int hiddenSpot) {
        intArray[hiddenSpot] = "..";
        return String.join(" ", intArray);
    }
    public static void fillTheBlank() {
        String rule = "What number is missing in the progression?";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int firstNum = Randomizer.getRandom();
            int step = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperationForProgression();
            int lengthOfProgression = Randomizer.getRandom(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            int hidIndex = lengthOfProgression - 2;
            String[] intArray = generateProgression(firstNum, step, randomOperation, lengthOfProgression);
            int secretNumber = (Integer.parseInt(intArray[hidIndex + 1]) + Integer.parseInt(intArray[hidIndex - 1])) / 2;
            String stringSecretNumber = Integer.toString(secretNumber);

            info[i][0] = massiveWithHiddenSpot(intArray, hidIndex);
            info[i][1] = stringSecretNumber;
        }
        Engine.startGame(rule, info);
    }
}
