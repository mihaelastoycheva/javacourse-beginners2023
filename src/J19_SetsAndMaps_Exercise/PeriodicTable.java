package J19_SetsAndMaps_Exercise;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> uniqueEl = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");

            uniqueEl.addAll(Arrays.asList(elements));
        }

        for (String s : uniqueEl) {
            System.out.print(s + " ");
        }
    }
}
