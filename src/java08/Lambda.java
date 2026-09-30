package java08;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("実行");
            }
        };
        // Java 8以降
        Runnable task_ = () -> System.out.println("実行");

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        // リストの並べ替えも簡潔に書けます
        names.sort((a, b) -> a.length() - b.length());
        System.out.println(names);

        // ラムダ式は、抽象メソッドを一つだけ持つ関数型インターフェースと組み合わせて使用します
        @FunctionalInterface
        interface Calculator {
            int calculate(int a, int b);
        }
        Calculator add = (a, b) -> a + b;

    }
}
