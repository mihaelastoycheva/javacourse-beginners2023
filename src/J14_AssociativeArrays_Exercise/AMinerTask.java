package J14_AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        String resource = scanner.nextLine();
        int quantity;

        while (!resource.equals("stop")){
            quantity = Integer.parseInt(scanner.nextLine());

            if (map.containsKey(resource)){
                map.put(resource, map.get(resource) + quantity);
            } else {
                map.put(resource, quantity);
            }

            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
