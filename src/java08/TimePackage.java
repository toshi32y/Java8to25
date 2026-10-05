package java08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimePackage {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 9, 29);

        // 色々増やしていこう
        System.out.println(date.lengthOfMonth());
        System.out.println(date.plusMonths(1).minusDays(1));

        LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        );
    }
    /*
    従来のjava.util.DateやCalendarより、APIの意図が明確で、イミュータブルな設計になっています。

    代表的なクラス
    LocalDate       ：日付
    LocalTime       ：時刻
    LocalDateTime   ：日付と時刻
    ZonedDateTime   ：タイムゾーン付き日時
    Instant         ：瞬間
    Duration        ：時間の長さ
    Period          ：日付の期間
    DateTimeFormatter：日時の書式
     */
}
