package J19_SetsAndMaps_Exercise;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lenghts = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = lenghts[0];
        int m = lenghts[1];

        Set<Integer> inputSet = new LinkedHashSet<>();
        Set<Integer> finalSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            inputSet.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < m; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            if (inputSet.contains(element)){
                finalSet.add(element);
            }
        }

        Iterator itr = finalSet.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
