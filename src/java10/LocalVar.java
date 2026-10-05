package java10;

import java.time.Instant;
import java.util.function.BiConsumer;

public class LocalVar {

    // ローカル変数の型推定が可能な場合、これはJavaではしない方が良いんじゃないかな
    void doSomething() {
        var now = Instant.now();
        // pass
    }

    // ラムダ式の仮引数として var の使用
    // Java 10 まで
    BiConsumer<String, Integer> consumer1 = (s, i) -> {
        //...
    };
    BiConsumer<String, Integer> consumer2 = (String s, Integer i) -> {
        // ...
    };

    // Java 11 以降
    BiConsumer<String, Integer> consumer1_ = (var s, var i) -> {
        // ...
    };

}
