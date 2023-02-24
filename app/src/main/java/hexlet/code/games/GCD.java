package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomizer;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;

public class GCD {
    public static String findRod(int randomNumber1, int randomNumber2) {
        if (randomNumber1 < randomNumber2) {
            findRod(randomNumber2, randomNumber1);
            return Integer.toString(randomNumber1);
        } else {
            var min = randomNumber2;
            var max = randomNumber1;
            var rod = max % min;
            while (rod != 0) {
                max = min;
                min = rod;
                rod = max % min;
            }
            return Integer.toString(min);
        }
    }
    public static void isGCD() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int randomNumber1 = Randomizer.getRandom();
            int randomNumber2 = Randomizer.getRandom();

            info[i][0] = randomNumber1 + " " + randomNumber2;
            info[i][1] = findRod(randomNumber1, randomNumber2);
        }
        Engine.startGame(rule, info);
    }
}
