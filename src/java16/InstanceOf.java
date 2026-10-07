package java16;

public class InstanceOf {
    public static void main(String[] args) {

        String obj = "";

        // java15以前
        if (obj instanceof String) {
            String text = (String) obj;
            System.out.println(text.length());
        }
        // java16以降、これいいね
        if (obj instanceof String text) {
            System.out.println(text.length());
        }

    }
}
