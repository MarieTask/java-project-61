package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.RandomOperation;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;

public class Progression {
    private static final int QUESTION = 0;
    private static final int ANSWER = 1;
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    public static String[] generateProgression(int firstNum, int step, char randomOperation, int length) {
        String[] strArr = new String[length];
        int temp = firstNum;
        for (var i = 0; i < strArr.length; i++) {
            strArr[i] = Integer.toString(temp);
            switch (randomOperation) {
                case '-':
                    temp -= step;
                    break;
                case '+':
                    temp += step;
                    break;
                default:
                    break;
            }
        }
        return strArr;
    }
    public static void fillTheBlank() {
        String rule = "What number is missing in the progression?";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int firstNum = Randomizer.getRandom();
            int step = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperationForProgression();
            int lengthOfProgression = Randomizer.getRandom(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            String[] strArr = generateProgression(firstNum, step, randomOperation, lengthOfProgression);
            int hidIndex = Randomizer.getRandom(0, lengthOfProgression - 1);
            String secretNumber = strArr[hidIndex];
            strArr[hidIndex] = "..";

            info[i][QUESTION] = String.join(" ", strArr);
            info[i][ANSWER] = secretNumber;
        }
        Engine.startGame(rule, info);
    }
}
