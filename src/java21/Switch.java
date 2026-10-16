package java21;

import java.awt.*;

public class Switch {

    // switchで型パターンを使えるようになりました。
    static String format(Object value) {
        return switch (value) {
            case Integer i -> "整数: " + i;
            case String s -> "文字列: " + s;
            case null -> "null";
            default -> "その他";
        };
    }
}
