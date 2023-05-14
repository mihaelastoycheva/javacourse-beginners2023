package J14_AssociativeArrays_Exercise;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.contains(" ")){
            input.replace(" ", "");
        }
        char[] chars = input.toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : chars) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
