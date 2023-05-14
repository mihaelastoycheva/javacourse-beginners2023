package J14_AssociativeArrays_Exercise;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input: 123 silver 6 shards 8 shards 5 motes 9 fangs 75 motes 103 MOTES 8 Shards 86 Motes 7 stones 19 silver

        String[] input = scanner.nextLine().toLowerCase(Locale.ROOT).split("\\s+");

        Map<String,Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length; i+=2) {
            int quantity = Integer.parseInt(input[i]);
            String material = input[i+1];

            if (map.containsKey(material)){
                map.put(material, map.get(material) + quantity);
            } else {
                map.put(material, quantity);
            }
        }

        if (!map.containsKey("shards")){
            map.put("shards", 0);
        }
        if(!map.containsKey("fragments")){
            map.put("fragments", 0);
        }
        if(!map.containsKey("motes")){
            map.put("motes", 0);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (entry.getKey().equals("fragments") && value >= 250){
                System.out.println("Valanyr obtained!");
                getLegendary(map, entry, value);
            } else if (entry.getKey().equals("shards") && value >= 250){
                System.out.println("Shadowmourne obtained!");
                getLegendary(map, entry, value);
            } else if (entry.getKey().equals("motes") && value >= 250){
                System.out.println("Dragonwrath obtained!");
                getLegendary(map, entry, value);
            }
        }
    }

    private static void getLegendary(Map<String, Integer> map, Map.Entry<String, Integer> entry, int value) {
        entry.setValue(value - 250);
        sortKeyMaterials(map);

        for (Map.Entry<String, Integer> secondEntry : map.entrySet()) {
            if (secondEntry.getKey().equals("shards") || secondEntry.getKey().equals("fragments")
                    || secondEntry.getKey().equals("motes")) {
                System.out.printf("%s: %d%n", secondEntry.getKey(), secondEntry.getValue());
            } else {
                map.remove(secondEntry.getKey()); // Remove entry from the map
            }
        }
    }




    public static void sortKeyMaterials(Map<String, Integer> map){
        LinkedHashMap<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for(Map.Entry<String,Integer> entry : sortedMap.entrySet()){
            if (entry.getKey().equals("shards") || entry.getKey().equals("fragments") || entry.getKey().equals("motes")){
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}

