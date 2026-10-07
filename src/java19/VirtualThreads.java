package java19;

public class VirtualThreads {
    public static void main(String[] args) {

        Thread.startVirtualThread(() -> {
            System.out.println("Virtual thread");
        });
        /* Threadとの仕組みの違い
            プラットフォームスレッド
                OS がスケジューリングする「カーネルスレッド」をラップしたもの。
                スレッドが実行されている間、対応する OS スレッドを占有し続ける。
                ブロッキング I/O を行うと、その OS スレッドもブロックされ、他の処理に使えなくなる。

            仮想スレッド
                JVM がスケジューリングする軽量スレッド。
                実際の実行は「キャリアスレッド」（内部のプラットフォームスレッド）上で行われるが、ブロッキング I/O 時には仮想スレッドだけサスペンドされ、キャリアスレッドは解放されて別の仮想スレッドに再利用される。
                これにより、ブロッキング I/O を使ってもスレッドプールや非同期 API を使わずに高い並行性を実現できる。違い
        */
    }
}
