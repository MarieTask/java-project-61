package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.Engine;

import static hexlet.code.Engine.MAX_ROUND;
import static hexlet.code.Engine.ANSWER_PLUS_QUESTION;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;

public class Even {
    public static void runEven() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] info = new String[MAX_ROUND][ANSWER_PLUS_QUESTION];

        for (var i = 0; i < MAX_ROUND; i++) {
            int randomNumber = Randomizer.getRandom();
            String answer = Integer.toString(randomNumber);
            info[i][QUESTION] = answer;
            info[i][ANSWER] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        Engine.startGame(rule, info);
    }
}
