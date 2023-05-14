package J20_StreamsFiles_PresentationLab;

import java.io.FileInputStream;
import java.io.IOException;

public class OpeningAFileStream {
    public static void main(String[] args) throws IOException {

        String path = "/Users/misha/Downloads/20. Java-Advanced-Streams-Files-and-Directories/20. Java-Advanced-Streams-Files-and-Directories-Resources/Files-and-Streams-Exercises-Resources/input.txt";

        FileInputStream fileStream = new FileInputStream(path);

        int read = fileStream.read();
        while (read >= 0) {
            System.out.print(read);
            read = fileStream.read();
        }
    }
}
