package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.RandomOperationForProgression;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;

public class Progression {
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
        String rule = "What number is missing in the progression?";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int firstNumber = Randomizer.getRandom();
            int diffBetweenTwoNum = Randomizer.getRandom();
            var randomOperation = RandomOperationForProgression.getRandomOperationForProgression();
            int lengthOfProgression = Randomizer.getRandom(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            int hidIndex = lengthOfProgression - 2;
            String[] intMas = createMassive(firstNumber, diffBetweenTwoNum, randomOperation, lengthOfProgression);
            int secretNumber = (Integer.parseInt(intMas[hidIndex + 1]) + Integer.parseInt(intMas[hidIndex - 1])) / 2;
            String stringSecretNumber = Integer.toString(secretNumber);

            info[i][0] = massiveWithHiddenSpot(intMas, hidIndex);
            info[i][1] = stringSecretNumber;
        }
        Engine.startGame(rule, info);
    }
}
