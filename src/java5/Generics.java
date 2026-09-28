package java5;

import java.util.*;

public class Generics {
    void doSomething() {
        /* java4以前
        List list = new ArrayList();
        list.add("Java");

        String value = (String) list.get(0);
        */

        // java5
        List<String> list = new ArrayList<String>();
        list.add("Java");

        String value = list.get(0);
    }
}
