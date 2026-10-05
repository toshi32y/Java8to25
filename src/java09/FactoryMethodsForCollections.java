package java09;

import java.util.*;

public class FactoryMethodsForCollections {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob");
        Set<Integer> numbers = Set.of(1, 2, 3);
        Map<String, Integer> scores = Map.of(
                "Alice", 80,
                "Bob", 90
        );
    }
}
