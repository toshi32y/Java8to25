package java16;

public class Record {
    public record Person(String name, int age) {
        /*
        自動的に次の要素が生成されます。
        ・コンストラクター
        ・アクセサメソッド
        ・equals
        ・hashCode
        ・toString
         */
    }
}
