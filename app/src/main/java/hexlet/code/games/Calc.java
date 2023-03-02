package hexlet.code.games;

import hexlet.code.RandomOperation;
import hexlet.code.Randomizer;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;

public class Calc {
    public static String calculate(int randomNum1, int randomNum2, char randomOperation) {

        var result = 0;
        switch (randomOperation) {
            case '+':
                result = randomNum1 + randomNum2;
                break;
            case '-':
                result = randomNum1 - randomNum2;
                break;
            case '*':
                result = randomNum1 * randomNum2;
                break;
            default:
                System.out.println("Sorry, this operation doesn't exist. Fix the code");
                System.exit(0);
                break;
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
            info[i][QUESTION] = randomNum1 + " " + randomOperation + " " + randomNum2;
            info[i][ANSWER] = calculate(randomNum1, randomNum2, randomOperation);
        }
        Engine.startGame(rule, info);
    }
}
