package J17_StacksAndQueue_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(input);

        ArrayDeque<Integer> numbers = new ArrayDeque<>(input);

        while(!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
