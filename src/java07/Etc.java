package java07;

import java.io.IOException;
import java.sql.SQLException;

public class Etc {
    public static void main(String[] args) {

        // マルチキャッチ
        try {
            // 処理
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        // 数値リテラルの改善
        int binary = 0b1010;
        long amount = 1_000_000L;

    }
}
