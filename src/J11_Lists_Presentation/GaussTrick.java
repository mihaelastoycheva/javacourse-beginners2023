package J11_Lists_Presentation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() / 2; i++) {
            int result = numbers.get(i) + numbers.get((numbers.size() - 1) - i);
            System.out.print(result + " ");
            /* Втори вариант:
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
             */
        }
        if (!(numbers.size() % 2 == 0)){
            int mid = numbers.size() / 2;
            System.out.print(numbers.get(mid));
        }
    }
}
