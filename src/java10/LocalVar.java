package java10;

import java.time.Instant;

public class LocalVar {

    // ローカル変数の型推定が可能な場合、これはJavaではしない方が良いんじゃないかな
    void doSomething() {
        var now = Instant.now();
        // pass
    }
}
