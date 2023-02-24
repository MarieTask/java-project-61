package hexlet.code;

public class RandomOperation {
    public static final char[] SYMBOLS = {'+', '-', '*'};
    public static char getRandomOperation() {
        char operation = SYMBOLS[Randomizer.getRandom(0,2)];
        return operation;
    }
}
