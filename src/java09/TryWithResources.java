package java09;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResources {
    public static void main(String[] args) {

        // あまり必要性が分からない…
        BufferedReader reader = Files.newBufferedReader(Path.of("path"));
        try (reader){
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
