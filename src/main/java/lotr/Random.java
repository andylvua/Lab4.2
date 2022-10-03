package lotr;

public class Random {
    static java.util.Random random = new java.util.Random();

    public static int randomInt(int low, int high) {
        return random.nextInt(high - low) + low;
    }
}
