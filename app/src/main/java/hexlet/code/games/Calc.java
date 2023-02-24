package hexlet.code.games;

import hexlet.code.RandomOperation;
import hexlet.code.Randomizer;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;

public class Calc {
    public static String count(int randomNum1, int randomNum2, char randomOperation) {

        var result = 0;
        switch (randomOperation) {
            case '+' -> result = randomNum1 + randomNum2;
            case '-' -> result = randomNum1 - randomNum2;
            case '*' -> result = randomNum1 * randomNum2;
        }
        return Integer.toString(result);
    }
    public static void calcGame() {
        String rule = "What is the result of the expression?";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];
        for (var i = 0; i < MAX_ROUND; i++) {
            int randomNum1 = Randomizer.getRandom();
            int randomNum2 = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperation();
            info[i][0] = randomNum1 + " " + randomOperation + " " + randomNum2;
            info[i][1] = count(randomNum1, randomNum2, randomOperation);
        }
        Engine.startGame(rule, info);
    }
}
