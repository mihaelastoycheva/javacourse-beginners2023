package J20_StreamsFiles_PresentationLab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) {
        String path = "/Users/misha/Downloads/20. Java-Advanced-Streams-Files-and-Directories" +
                "/20. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "/Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";

        try (InputStream in = new FileInputStream(path)) {
            int read = in.read();
            while (read >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(read));
                read = in.read();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
