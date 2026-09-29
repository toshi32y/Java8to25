package java05;

public class AutoBoxing {
    public static void main(String[] args) {
        // Integer number_ = Integer.valueOf(10);
        // int result = number_.intValue();

        Integer number = 10;  // intからIntegerへ自動変換
        int value = number;    // Integerからintへ自動変換

        number = null;
        value = number; // NullPointerException
    }
}
