package java08;

import java.time.LocalDate;

public class TimePackage {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 9, 29);

        // 色々増やしていこう
        System.out.println(date.lengthOfMonth());
        System.out.println(date.plusMonths(1).minusDays(1));
    }
}
