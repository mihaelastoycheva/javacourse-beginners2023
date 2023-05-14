package J14_AssociativeArrays_PresentationLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordsSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> map = new TreeMap<>();

        for (int i = 0; i < size; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            map.putIfAbsent(word, new ArrayList<>());
            map.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
