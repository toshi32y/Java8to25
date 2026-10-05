package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File {
    public static void main(String[] args) {

        try {
            Path path = Path.of("url");
            String text = Files.readString(path);
            Files.writeString(path, "Hello");
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
