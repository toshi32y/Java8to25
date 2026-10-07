package java21;

public class RecordPatterns {
    public static void main(String[] args) {

        record Point(int x, int y) {}

        Object value = new Point(10, 20);

        if (value instanceof Point(int x, int y)) {
            System.out.println(x + y);
        }


    }
}
