package J19_SetsAndMaps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputResource = scanner.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();

        while(!inputResource.equals("stop")){
            String resource = inputResource;
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.put(resource,quantity);

            inputResource = scanner.nextLine();
        }

        for (String s : resources.keySet()) {
            System.out.println(s + " -> " + resources.get(s));
        }
    }
}
