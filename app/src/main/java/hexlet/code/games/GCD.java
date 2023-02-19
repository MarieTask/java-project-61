package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomizer;

public class GCD {
    public static String findRod(int randomNumber1, int randomNumber2) {
        if (randomNumber1 < randomNumber2) {
            var min = randomNumber1;
            var max = randomNumber2;
            var rod = max % min;
            while (rod != 0) {
                max = min;
                min = rod;
                rod = max % min;
            }
            return Integer.toString(min);
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
        int countOfRounds = Engine.getCountOfRounds();
        String[][] info = new String[Engine.getCountOfRounds()][Engine.getValueOfArray()];

        System.out.println(rule);

        for (var i = 0; i < countOfRounds; i++) {
            int randomNumber1 = Randomizer.getRandom();
            int randomNumber2 = Randomizer.getRandom();

            info[i][0] = randomNumber1 + " " + randomNumber2;
            info[i][1] = findRod(randomNumber1, randomNumber2);
        }
        Engine.startGame(rule, info);
    }
}
