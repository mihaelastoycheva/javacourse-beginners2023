package J15_TextProcessing_Presentation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().
                split("\\s+")).
                collect(Collectors.toList());

        StringBuilder join = new StringBuilder();

        for (int i = 0; i < stringList.size(); i++) {
            int length = stringList.get(i).length();
            for (int j = 0; j < length; j++) {
                join.append(stringList.get(i));
            }
        }

        System.out.println(join);
    }
}
