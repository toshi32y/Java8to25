package java08;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");

        // レクションのデータを、抽出、変換、集計などの処理パイプラインとして扱えるようになりました。
        List<String> result = names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        // Java16
        List<String> result_ = names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        /*
        Stream APIには、次のような操作があります。

        filter：条件で絞り込む
        map：要素を変換する
        sorted：並べ替える
        distinct：重複を除く
        limit：件数を制限する
        collect：結果をコレクションなどにまとめる
        reduce：複数要素を一つに集約する
         */

    }
}
