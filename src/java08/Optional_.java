package java08;

import java.util.*;

public class Optional_ {
    public static void main(String[] args) {

        // nullチェックした方が良い気もするけど…

        // nullを扱うためのコンテナ型としてOptionalが追加されました。
        Optional<String> name = Optional.of("Java");
        name.ifPresent(System.out::println);
        name.ifPresentOrElse(System.out::println, () -> System.out.println("Java2"));

        // 値がない場合の処理も表現できます。
        String result = Optional.of("")
                .map(String::trim)
                .orElse("default");
    }
}
