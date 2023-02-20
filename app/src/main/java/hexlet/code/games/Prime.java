package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;

public class Prime {
    public static String isPrime(int randomNumber) {
        String result = "";
        int count = 0;
        if (randomNumber <= 1) {
            count++;
        }
        if (randomNumber == 2) {
            result = "yes";
        }
        for (int divider = 2; divider <= randomNumber / 2; divider++) {
            var modulo = randomNumber % divider;
            if (modulo == 0) {
                count++;
            }
        }
        if (count <= 0) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }
    public static void startPrimeGame() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int randomNumber = Randomizer.getRandom();
            String answer = Integer.toString(randomNumber);
            info[i][0] = answer;
            info[i][1] = isPrime(randomNumber);
        }
        Engine.startGame(rule, info);
    }
}
