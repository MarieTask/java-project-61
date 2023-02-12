package hexlet.code;

import java.util.Random;
public class RandomOperationForProgression {
    public static char getRandomOperationForProgression() {
        String symbols = "+-";

        Random operations = new Random();
        char operationForProgression = symbols.charAt(operations.nextInt(symbols.length()));
        return operationForProgression;
    }
}