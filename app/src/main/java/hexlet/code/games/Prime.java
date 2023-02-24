package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;

public class Prime {
    public static boolean isPrime(int randomNumber) {
        if (randomNumber <= 1) {
            return false;
        }
        for (int divider = 2; divider < randomNumber; divider++) {
            var modulo = randomNumber % divider;
            if (modulo == 0) {
                return false;
            }
        }
        return true;
    }
    public static void startPrimeGame() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int randomNumber = Randomizer.getRandom();
            info[i][0] = "" + randomNumber;
            info[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.startGame(rule, info);
    }
}
