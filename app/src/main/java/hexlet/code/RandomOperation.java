package hexlet.code;

public class RandomOperation {
    public static final char[] OPERATIONS = {'+', '-', '*'};
    public static final char[] OPERATIONSFORPROGRESSION = {'+', '-'};
    public static char getRandomOperation() {

        return OPERATIONS[Randomizer.getRandom(0, OPERATIONS.length - 1)];
    }
    public static char getRandomOperationForProgression() {

        return OPERATIONSFORPROGRESSION[Randomizer.getRandom(0, OPERATIONSFORPROGRESSION.length - 1)];
    }
}
