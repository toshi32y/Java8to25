package java05;

import java.util.*;

public class Generics {
    void doSomething() {

        // List list = new ArrayList();                 // java4以前
        // List<String> list = new ArrayList<String>(); // java5
        List<String> list = new ArrayList<>();          // java7
        list.add("Java");

        // String value = (String) list.get(0);         // java4以前
        String value = list.get(0);
    }
}
