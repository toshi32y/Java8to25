package java09;

import java.nio.charset.Charset;

public interface PrivateStaticInterface {

    // Java 8 でインタフェースに default と static メソッドを定義できるようになりました。
    // その延長線上の機能拡張として、Java 9 ではインタフェース内に private メソッドを定義できるようになりました。
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
