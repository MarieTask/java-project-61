package hexlet.code.games;

import hexlet.code.RandomOperation;
import hexlet.code.Randomizer;
import hexlet.code.Engine;

public class Calc {
    public static String count(int randomNum1, int randomNum2, char randomOperation) {

        var result = 0;
        if (randomOperation == '+') {
            result = randomNum1 + randomNum2;
        } else if (randomOperation == '-') {
            result = randomNum1 - randomNum2;
        } else if (randomOperation == '*') {
            result = randomNum1 * randomNum2;
        }
        return Integer.toString(result);
    }
    public static void calcGame() {
        String rule = "What is the result of the expression?";
        int countOfRounds = Engine.getCountOfRounds();
        String[][] info = new String[Engine.getCountOfRounds()][Engine.getValueOfArray()];

        System.out.println(rule);

        for (var i = 0; i < countOfRounds; i++) {
            int randomNum1 = Randomizer.getRandom();
            int randomNum2 = Randomizer.getRandom();
            var randomOperation = RandomOperation.getRandomOperation();
            info[i][0] = randomNum1 + " " + randomOperation + " " + randomNum2;
            info[i][1] = count(randomNum1, randomNum2, randomOperation);
        }
        Engine.startGame(rule, info);
    }
}
