package J19_SetsAndMaps_PresentationLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> stores = new TreeMap<>();

        String input = scanner.nextLine();

        while(!input.equals("Revision")){
            String[] inputArr = input.split(", ");

            String product = inputArr[1];
            Double price = Double.parseDouble(inputArr[2]);

            if(!stores.containsKey(inputArr[0])){
                Map<String, Double> products = new TreeMap<>();
                products.put(product, price);
                stores.put(inputArr[0], products);
            } else {
                stores.get(inputArr[0]).put(product, price);
            }

            input = scanner.nextLine();
        }

        for (String s : stores.keySet()) {
            System.out.println(s + " -> ");
            for (String s1 : stores.get(s).keySet()) {
                System.out.printf("Products: %s, Price: %.1f\n", s1, stores.get(s).get(s1));
            }
            System.out.println();
        }
    }
}
