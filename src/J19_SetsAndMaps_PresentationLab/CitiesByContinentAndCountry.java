package J19_SetsAndMaps_PresentationLab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (continents.containsKey(input[0])){
                //Ако континента и държавата съвпадат:
                if (continents.get(input[0]).containsKey(input[1])){
                    continents.get(input[0]).get(input[1]).add(input[2]);
                }
                //Ако съвпада само континента:
                else {
                    List<String> cities = new ArrayList<>();
                    cities.add(input[2]);
                    continents.get(input[0]).put(input[1], cities);
                }
            }
            //Ако НЕ съвпада континента, изцяло нов запис в Мапа:
            else {
                Map<String,List<String>> countries = new LinkedHashMap<>();
                List<String> cities = new ArrayList<>();
                cities.add(input[2]);
                countries.put(input[1], cities);
                continents.put(input[0], countries);
            }
        }

        for (String continent : continents.keySet()) {
            System.out.println(continent + ":");
            for (String country : continents.get(continent).keySet()) {
                System.out.print("\t" + country + " -> ");
                System.out.print(String.join(", ", continents.get(continent).get(country)) + "\n");
            }
        }
    }
}
