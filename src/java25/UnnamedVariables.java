package java25;

public class UnnamedVariables {
    public static void main(String[] args) {
        record Point(int x, int y) {}

        Object obj = new Point(10, 20);
        if (obj instanceof Point(int x, _)) {
            System.out.println(x);
        }
    }
}
