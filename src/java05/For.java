package java05;

import java.util.List;

public class For {
    void doSomething() {
        List<String> names = null;

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
