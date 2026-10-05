package java11;

import java.util.List;
import java.util.stream.Stream;

public class StringAPI {
    public static void main(String[] args) {
        // Boolean b = " ".isBlank();
        Stream<String> stream = "Java\n".lines();
        String s = "Java".repeat(3);
        s = " Java ".strip();
    }

}
