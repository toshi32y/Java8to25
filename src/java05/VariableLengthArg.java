package java05;

public class VariableLengthArg {
    // sum(1, 2);
    // sum(1, 2, 3, 4);
    // 内部的には配列として扱われる。興味なし
    static int sum(int... numbers) {
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        return result;
    }
}
