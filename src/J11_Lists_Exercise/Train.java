package J11_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacityOfEach = Integer.parseInt(scanner.nextLine());

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        boolean flag = true;
        boolean checker = true;

        for (int i = 0; i < 1; i++) {
            while (!(input.get(i).equals("end"))){
                if (input.get(i).equals("Add")){
                    int number = Integer.parseInt(String.valueOf(input.get(i+1)));
                    nums1.add(number);
                    flag = false;
                }
                if (flag){
                    int number = Integer.parseInt(String.valueOf(input.get(i)));
                    for (int j = 0; j < nums1.size(); j++) {
                        if (checker && ((nums1.get(j) + number) <= capacityOfEach)){
                            nums1.set(j, nums1.get(j) + number);
                            checker = false;
                        }
                    }
                }
                flag = true;
                checker = true;
                input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            }
        }
        for (Integer element : nums1) {
            System.out.print(element + " ");
        }
    }
}
