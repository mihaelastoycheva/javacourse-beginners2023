package J19_SetsAndMaps_PresentationLab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> results = new LinkedHashMap<>();

        for (double v : input) {
            if(results.containsKey(v)){
                results.put(v,results.get(v)+1);
            } else {
                results.put(v,1);
            }
        }

        for (Double key : results.keySet()) {
            System.out.println(key + " -> " + results.get(key));
        }
    }
}
