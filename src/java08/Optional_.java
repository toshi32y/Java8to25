package java08;

import java.util.*;

public class Optional_ {
    public static void main(String[] args) {

        // nullを扱うためのコンテナ型としてOptionalが追加されました。
        Optional<String> name = Optional.of("Java");
        name.ifPresent(System.out::println);

        // 値がない場合の処理も表現できます。
        String result = Optional.of("")
                .map(String::trim)
                .orElse("default");
    }
}
