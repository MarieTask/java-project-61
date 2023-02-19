package hexlet.code.games;

import hexlet.code.Randomizer;
import hexlet.code.Engine;

public class Even {
    public static void runEven() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int countOfRounds = Engine.getCountOfRounds();
        String[][] info = new String[Engine.getCountOfRounds()][Engine.getValueOfArray()];

        System.out.println(rule);

        for (var i = 0; i < countOfRounds; i++) {
            int randomNumber = Randomizer.getRandom();
            String answer = Integer.toString(randomNumber);
            info[i][0] = answer;
            info[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        Engine.startGame(rule, info);
    }
}
