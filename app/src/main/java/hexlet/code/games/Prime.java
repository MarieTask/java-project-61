package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.Engine;

import java.util.Scanner;
public class Prime {
    public static String isTrue(int randomNumber) {
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
    public static void isPrime() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int countOfRounds = Engine.getCountOfRounds();
        String[][] info = new String[Engine.getCountOfRounds()][Engine.getValueOfArray()];

        System.out.println(rule);

        for (var i = 0; i < countOfRounds; i++) {
            int randomNumber = Randomizer.getRandom();
            String answer = Integer.toString(randomNumber);
            info[i][0] = answer;
            info[i][1] = isTrue(randomNumber);
        }
        Engine.startGame(rule, info);
    }
}
