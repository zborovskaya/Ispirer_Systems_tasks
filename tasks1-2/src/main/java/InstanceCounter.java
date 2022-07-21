public class InstanceCounter {
    private static int count = 0;

    public InstanceCounter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
