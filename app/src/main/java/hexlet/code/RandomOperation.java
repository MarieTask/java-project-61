package hexlet.code;

import java.util.Random;
public class RandomOperation {
    public static char getRandomOperation() {
        String symbols = "+-*";

        Random operations = new Random();
        char operation = symbols.charAt(operations.nextInt(symbols.length()));
        return operation;
    }
}
