package hexlet.code;

public class RandomOperation {
    public static final char[] SYMBOLS = {'+', '-', '*'};
    public static final char[] SYMBOLSFORPROGRESSION = {'+', '-'};
    public static char getRandomOperation() {
        return SYMBOLS[Randomizer.getRandom(0, 2)];
    }
    public static char getRandomOperationForProgression() {
        return SYMBOLSFORPROGRESSION[Randomizer.getRandom(0, 1)];
    }
}
