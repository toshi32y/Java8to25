package java10;

import java.time.Instant;
import java.util.List;
import java.util.function.BiConsumer;

public class LocalVar {
    static void main() {
        // ローカル変数の型推定が可能な場合、これはJavaではしない方が良いんじゃないかな
        var message = "Hello";
        var numbers = List.of(1, 2, 3);
        // varは静的型付けをなくす機能ではありません。コンパイル時に型が決まり、後から別の型を代入することはできません。

        // 次のような使い方はできません。
        // フィールドでは使えない
        // var count = 10;

        // メソッドの戻り値型では使えない
        // var getName() { ... }

        /*
         * ラムダ式の仮引数として var の使用
         */
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

}
