import java.nio.charset.Charset;

public interface DefaultAndStaticInterface {

    /*
     * Java 8 でインタフェースに default と static メソッドを定義できるようになりました。
     *
    //java.util.function の関数インタフェースは default と static を活用している
    public interface Function<T, R> {
        R apply(T t);
        default <V> Function<V, R> compose(Function<? super V, ? extends T> before) { ... }
        default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) { ... }
        static <T> Function<T, T> identity() { ... }
    }
     */

    /*
     * その延長線上の機能拡張として、Java 9 ではインタフェース内に private メソッドを定義できるようになりました。
     */
    // Java 8
    interface ByteArrayGetter_ {
        default byte[] fromString(String s) {
            return s.getBytes(Charset.forName("MS932")); // デフォルトの Charset を取得。
        }

        default byte[] fromMyString(String ms) {
            return ms.getBytes(Charset.forName("MS932")); // デフォルトの Charset を取得。都度書くのはだるい :(
        }
        // static Charset defaultCharset() {  // private メソッド定義できないから処理を共通化すると余計な API が公開されてしまう :(
        //    return Charset.forName("MS932");
        // }
    }

    // Java 9 以降
    interface ByteArrayGetter {
        default byte[] fromString(String s) {
            return s.getBytes(defaultCharset());
        }

        default byte[] fromMyString(String ms) {
            return ms.getBytes(defaultCharset());
        }

        private static Charset defaultCharset() { // 余計な API を公開せずに処理を共通化できる :D
            return Charset.forName("MS932");
        }
    }


}
