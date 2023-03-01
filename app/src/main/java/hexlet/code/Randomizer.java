package hexlet.code;

public class Randomizer {
    private static final int MAX_NUMBER = 10;
    public static int getRandom() {

        return (int) (Math.random() * MAX_NUMBER + 1);
    }
    public static int getRandom(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);
    }
}
