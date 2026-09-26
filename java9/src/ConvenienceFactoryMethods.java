import java.util.*;

public class ConvenienceFactoryMethods {
    // Java 8
    private final static Map<Integer, String> japaneseMonthNames;

    static {
        // 1) 入れ物を new する
        Map<Integer, String> map = new HashMap<>();
        // 2) 中身を入れる
        map.put(1, "睦月");
        // ...
        map.put(12, "師走");
        // 3) 読み取り専用ビューにする
        japaneseMonthNames = Collections.unmodifiableMap(map);
    }

    // Java 9 以降
    private final static Map<Integer, String> japaneseMonthNames_ = Map.ofEntries(
            Map.entry(1, "睦月"),
            // ...
            Map.entry(12, "師走")
    );
}
