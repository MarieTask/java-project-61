package hexlet.code;

public class Randomizer {
    public static int getRandom() {
        return (int) (Math.random() * 10 + 1);
    }
    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
