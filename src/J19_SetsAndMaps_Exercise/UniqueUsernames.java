package J19_SetsAndMaps_Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> usernames = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            usernames.add(scanner.nextLine());
        }

        System.out.println(usernames);
    }
}
