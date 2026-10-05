package java08;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_ {
    public static void main(String[] args) {

        // 非同期処理を組み立てるためのCompletableFutureが追加されました。
        // 非同期処理の結果に対して、後続処理をつなげられます。
        // 後で勉強する
        CompletableFuture
                .supplyAsync(() -> "result")
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println);

    }
}
