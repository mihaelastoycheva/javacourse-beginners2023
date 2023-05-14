package J11_Lists_Presentation;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) < 0){
                // !! Обърни внимание:
                nums1.remove(i--);
            }
        }

        if (nums1.isEmpty()){
            System.out.println("empty");
        } else {
            Collections.reverse(nums1);
            for (Integer integer : nums1) {
                System.out.print(integer + " ");
            }
        }
    }
}
