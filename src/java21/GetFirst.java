package java21;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class GetFirst {
    public static void main(String[] args) {

        // 先頭・末尾の要素を統一的に扱うコレクションAPIが追加されました。
        SequencedCollection<String> values =
                new ArrayList<>(List.of("A", "B", "C"));

        String first = values.getFirst();
        String last = values.getLast();



    }
}
