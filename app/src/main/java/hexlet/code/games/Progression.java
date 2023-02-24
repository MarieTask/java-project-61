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
        String[] strArr = new String[length];
        int[] intArr = new int[length];
        intArr[0] = firstNum;
        for (var i = 1; i < intArr.length; i++) {
            switch (randomOperation) {
                case '-':
                    intArr[i] = intArr[i - 1] - step;
                    break;
                case '+':
                    intArr[i] = intArr[i - 1] + step;
                    break;
                default:
                    break;
            }
        }
        for (var j = 0; j < strArr.length; j++) {
            strArr[j] = String.valueOf(intArr[j]);
        }
        return strArr;
    }
    public static String arrayWithHiddenSpot(String[] intArr, int hiddenSpot) {
        intArr[hiddenSpot] = "..";
        return String.join(" ", intArr);
    }
    public static void fillTheBlank() {
        String rule = "What number is missing in the progression?";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int firstNum = Randomizer.getRandom();
            int step = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperationForProgression();
            int lengthOfProgression = Randomizer.getRandom(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            int hidIndex = Randomizer.getRandom(0, lengthOfProgression - 1);
            String[] intArr = generateProgression(firstNum, step, randomOperation, lengthOfProgression);
            int secretNumber = (Integer.parseInt(intArr[hidIndex]));
            String stringSecretNumber = Integer.toString(secretNumber);

            info[i][0] = arrayWithHiddenSpot(intArr, hidIndex);
            info[i][1] = stringSecretNumber;
        }
        Engine.startGame(rule, info);
    }
}
