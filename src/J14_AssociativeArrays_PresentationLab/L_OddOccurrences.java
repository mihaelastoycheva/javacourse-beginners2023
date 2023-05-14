package J14_AssociativeArrays_PresentationLab;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class L_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().toLowerCase(Locale.ROOT).split("\\s+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String s : input) {
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            } else {
                map.put(s,1);
            }
        }

        for(Map.Entry<String,Integer> word : map.entrySet()){
            if (!(word.getValue() % 2 == 0)){
                System.out.print(word.getKey() + ", ");
            }
        }
    }
}
