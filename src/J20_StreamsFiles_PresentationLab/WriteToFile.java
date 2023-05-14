package J20_StreamsFiles_PresentationLab;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String inputPath = "/Users/misha/Downloads/20. Java-Advanced-Streams-Files-and-Directories" +
                "/20. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "/Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";

        String outputPath = "/Users/misha/Downloads/20. Java-Advanced-Streams-Files-and-Directories" +
                "/20. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "/Files-and-Streams-Exercises-Resources/outputWriteToFile.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (!symbols.contains((char)oneByte)) {
                    out.write(oneByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
