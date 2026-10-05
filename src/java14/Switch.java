package java14;

public class Switch {
    public static void main(String[] args) {

        int value = 1;

        // switchが式として正式に使えるようになりました。
        int result = switch (value) {
            case 1 -> 10;
            case 2 -> 20;
            default -> 0;
        };

        // 複数文を書く場合はyieldを使います。
        int result_ = switch (value) {
            case 1 -> {
                int calculated = 10 * 2;
                yield calculated;
            }
            default -> 0;
        };

    }
}
