package J11_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (int i = 0; i < 1; i++) {
            while (!(input.get(0).equals("End"))){
                if (input.get(0).equals("Add")){
                    int number = Integer.parseInt(String.valueOf(input.get(1)));
                    nums1.add(number);

                } else if (input.get(0).equals("Insert")){
                    boolean flag = true;
                    int number = Integer.parseInt(String.valueOf(input.get(1)));
                    int index = Integer.parseInt(String.valueOf(input.get(2)));
                    if (index >= nums1.size()){
                        System.out.println("Invalid index");
                        flag = false;
                    }
                    if (flag) {
                        nums1.add(index, number);
                    }

                } else if (input.get(0).equals("Remove")){
                    boolean flag = true;
                    int index = Integer.parseInt(String.valueOf(input.get(1)));
                    if (index >= nums1.size()){
                        System.out.println("Invalid index");
                        flag = false;
                    }
                    if (flag){
                        nums1.remove(index);
                    }

                } else if (input.get(0).equals("Shift") && input.get(1).equals("left")){
                    int count = Integer.parseInt(String.valueOf(input.get(2)));
                    for (int j = 0; j < count; j++) {
                        nums1.add(nums1.get(0));
                        nums1.remove(0);
                    }

                } else if (input.get(0).equals("Shift") && input.get(1).equals("right")){
                    int count = Integer.parseInt(String.valueOf(input.get(2)));
                    for (int j = 0; j < count; j++) {
                        nums1.add(0, nums1.get(nums1.size()-1));
                        nums1.remove(nums1.size()-1);
                    }
                }

                input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            }
        }

        for (Integer numbers:nums1) {
            System.out.print(numbers + " ");
        }
    }
}
