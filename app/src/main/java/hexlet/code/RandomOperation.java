package hexlet.code;

import java.util.Random;

public class RandomOperation {
    public static final char[] SYMBOLS = {'+', '-', '*'};
    public static final char[] SYMBOLSFORPROGRESSION = {'+', '-'};
    public static char getRandomOperation() {
        char operation = SYMBOLS[Randomizer.getRandom(0, 2)];
        return operation;
    }
    public static char getRandomOperationForProgression() {
        char operationForProgression = SYMBOLSFORPROGRESSION[Randomizer.getRandom(0, 1)];
        return operationForProgression;
    }
}
