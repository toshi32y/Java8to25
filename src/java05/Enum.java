package java05;

public class Enum {
    /*
     * Enumを型安全に作る事が出来ます。enumにはフィールドやメソッドも定義できます。
     */
    enum Status {
        // READY,
        // RUNNING,
        // FINISHED
        READY("準備中"),
        RUNNING("実行中"),
        FINISHED("完了");

        private final String label;

        Status(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
