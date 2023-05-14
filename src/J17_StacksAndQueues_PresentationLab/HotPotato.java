package J17_StacksAndQueues_PresentationLab;

import java.util.*;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : children)
            queue.offer(child);

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++)
                //Взима първия елемент от опашката, изтрива го и го добавя най-отзад
                queue.offer(queue.poll());

            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());

    }
}
