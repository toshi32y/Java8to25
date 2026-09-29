package java07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        /*
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader()FileReader("data.txt"));
            System.out.println(reader.readLine());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
         */

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }
}
